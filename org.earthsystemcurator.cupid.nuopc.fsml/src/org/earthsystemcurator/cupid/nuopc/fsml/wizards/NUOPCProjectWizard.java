package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NUOPCProjectWizard extends Wizard implements INewWizard {

	private WizardNewProjectCreationPage page;
	private NUOPCProjectWizardPage2 page2;
	private NUOPCProjectWizardPage3 page3;
	
	

	/**
	 * Constructor for NUOPCProjectWizard.
	 */
	public NUOPCProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Create NUOPC Project");
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		
		page = new WizardNewProjectCreationPage("Create NUOPC Project");
		page.setTitle("Create NUOPC Project");
		page.setDescription("Create a project for developing a NUOPC application.");
		
		addPage(page);
		
		page2 = new NUOPCProjectWizardPage2();
		addPage(page2);
		
		page3 = new NUOPCProjectWizardPage3();
		addPage(page3);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		//final String containerName = page.getContainerName();
		//final String fileName = page.getFileName();
		//final String projectName = page.getProjectName();
		final IProject projectHandle = page.getProjectHandle();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectHandle, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(IProject projectHandle, IProgressMonitor monitor) throws CoreException {
		
		// create a sample file
		monitor.beginTask("Creating " + projectHandle.getName(), 1);
		projectHandle.create(monitor);
		
		/*
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		
		monitor.worked(1);
		*/
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.mpe file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.earthsystemcurator.cupid.nuopc.fsml", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		//this.selection = selection;
	}
	
	public static void updateFont(Control c, int style) {
		FontData fontData = c.getFont().getFontData()[0];
		Font font = new Font(Display.getDefault(), new FontData(fontData.getName(), fontData.getHeight(), style));
		c.setFont(font);
	}
	
}