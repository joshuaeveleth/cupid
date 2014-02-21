/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CupidLanguageFactoryImpl extends EFactoryImpl implements CupidLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CupidLanguageFactory init()
  {
    try
    {
      CupidLanguageFactory theCupidLanguageFactory = (CupidLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(CupidLanguagePackage.eNS_URI);
      if (theCupidLanguageFactory != null)
      {
        return theCupidLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CupidLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CupidLanguagePackage.MAPPINGS: return createMappings();
      case CupidLanguagePackage.CONCEPT_DEF_OR_REF: return createConceptDefOrRef();
      case CupidLanguagePackage.CONCEPT_DEF: return createConceptDef();
      case CupidLanguagePackage.ANONYMOUS_CONCEPT: return createAnonymousConcept();
      case CupidLanguagePackage.CONCEPT_DEF_BODY: return createConceptDefBody();
      case CupidLanguagePackage.CONCEPT_REF: return createConceptRef();
      case CupidLanguagePackage.CARDINALITY: return createCardinality();
      case CupidLanguagePackage.MAPPING: return createMapping();
      case CupidLanguagePackage.IMPLICIT_CONTEXT_MAPPING: return createImplicitContextMapping();
      case CupidLanguagePackage.MODULE: return createModule();
      case CupidLanguagePackage.USES_MODULE: return createUsesModule();
      case CupidLanguagePackage.USES_ENTITY: return createUsesEntity();
      case CupidLanguagePackage.SUBROUTINE: return createSubroutine();
      case CupidLanguagePackage.FORMAL_PARAM: return createFormalParam();
      case CupidLanguagePackage.INTENT: return createIntent();
      case CupidLanguagePackage.TYPE: return createType();
      case CupidLanguagePackage.SUBROUTINE_NAME: return createSubroutineName();
      case CupidLanguagePackage.CALL: return createCall();
      case CupidLanguagePackage.ACTUAL_PARAM: return createActualParam();
      case CupidLanguagePackage.ID_OR_WILDCARD: return createIDOrWildcard();
      case CupidLanguagePackage.ID_OR_PATH_EXPR: return createIDOrPathExpr();
      case CupidLanguagePackage.PATH_EXPR: return createPathExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mappings createMappings()
  {
    MappingsImpl mappings = new MappingsImpl();
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDefOrRef createConceptDefOrRef()
  {
    ConceptDefOrRefImpl conceptDefOrRef = new ConceptDefOrRefImpl();
    return conceptDefOrRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef createConceptDef()
  {
    ConceptDefImpl conceptDef = new ConceptDefImpl();
    return conceptDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousConcept createAnonymousConcept()
  {
    AnonymousConceptImpl anonymousConcept = new AnonymousConceptImpl();
    return anonymousConcept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDefBody createConceptDefBody()
  {
    ConceptDefBodyImpl conceptDefBody = new ConceptDefBodyImpl();
    return conceptDefBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptRef createConceptRef()
  {
    ConceptRefImpl conceptRef = new ConceptRefImpl();
    return conceptRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitContextMapping createImplicitContextMapping()
  {
    ImplicitContextMappingImpl implicitContextMapping = new ImplicitContextMappingImpl();
    return implicitContextMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesModule createUsesModule()
  {
    UsesModuleImpl usesModule = new UsesModuleImpl();
    return usesModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesEntity createUsesEntity()
  {
    UsesEntityImpl usesEntity = new UsesEntityImpl();
    return usesEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subroutine createSubroutine()
  {
    SubroutineImpl subroutine = new SubroutineImpl();
    return subroutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParam createFormalParam()
  {
    FormalParamImpl formalParam = new FormalParamImpl();
    return formalParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intent createIntent()
  {
    IntentImpl intent = new IntentImpl();
    return intent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubroutineName createSubroutineName()
  {
    SubroutineNameImpl subroutineName = new SubroutineNameImpl();
    return subroutineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParam createActualParam()
  {
    ActualParamImpl actualParam = new ActualParamImpl();
    return actualParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDOrWildcard createIDOrWildcard()
  {
    IDOrWildcardImpl idOrWildcard = new IDOrWildcardImpl();
    return idOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IDOrPathExpr createIDOrPathExpr()
  {
    IDOrPathExprImpl idOrPathExpr = new IDOrPathExprImpl();
    return idOrPathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr createPathExpr()
  {
    PathExprImpl pathExpr = new PathExprImpl();
    return pathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguagePackage getCupidLanguagePackage()
  {
    return (CupidLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CupidLanguagePackage getPackage()
  {
    return CupidLanguagePackage.eINSTANCE;
  }

} //CupidLanguageFactoryImpl