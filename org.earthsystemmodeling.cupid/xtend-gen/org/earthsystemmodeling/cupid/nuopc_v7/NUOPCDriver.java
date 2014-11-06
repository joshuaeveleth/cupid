package org.earthsystemmodeling.cupid.nuopc_v7;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label("NUOPC Driver")
@SuppressWarnings("all")
public class NUOPCDriver extends CodeConcept<NUOPCDriver, NUOPCDriver, ASTModuleNode> {
  @Label("SetServices")
  public static class SetServices extends CodeConcept<NUOPCDriver.SetServices, NUOPCDriver, ASTSubroutineStmtNode> {
    @Name
    public String subroutineName;
    
    private long callsCompDeriveID = (-1);
    
    public SetServices(final NUOPCDriver parent, final CodeDBIndex codeDB) {
      super(parent, codeDB);
    }
    
    public NUOPCDriver.SetServices reverse() {
      Object _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("esmf_setservices(_sid, ");
        long _parentID = this.parentID();
        _builder.append(_parentID, "");
        _builder.append(", _sname), ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("( call_(_cid, _sid, \'NUOPC_CompDerive\') ; true).");
        ResultSet rs = this.execQuery(_builder);
        try {
          boolean _next = rs.next();
          if (_next) {
            long _long = rs.getLong("_sid");
            this._id = _long;
            String _string = rs.getString("_sname");
            this.subroutineName = _string;
            long _long_1 = rs.getLong("_cid");
            this.callsCompDeriveID = _long_1;
            rs.close();
            return this;
          }
        } catch (final Throwable _t) {
          if (_t instanceof SQLException) {
            final SQLException e = (SQLException)_t;
            CupidActivator.log("SQL error", e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = null;
      }
      return ((NUOPCDriver.SetServices)_xblockexpression);
    }
    
    public TextFileChange forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
    
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SetServices: (id=");
      _builder.append(this._id, "");
      _builder.append(", callsCompDeriveID=");
      _builder.append(this.callsCompDeriveID, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  @Label("SetModelServices")
  public static class SetModelServices extends CodeConcept<NUOPCDriver.SetModelServices, NUOPCDriver.Initialization, ASTSubroutineStmtNode> {
    @Name
    public String subroutineName;
    
    public SetModelServices(final NUOPCDriver.Initialization parent, final CodeDBIndex codeDB) {
      super(parent, codeDB);
    }
    
    public NUOPCDriver.SetModelServices reverse() {
      try {
        NUOPCDriver.SetModelServices _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("esmf_setservices(_sid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", _sname), ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t ");
          _builder.append("call_(_cid, _sid, \'NUOPC_DriverAddComp\').");
          ResultSet rs = this.execQuery(_builder);
          NUOPCDriver.SetModelServices _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCDriver.SetModelServices _xblockexpression_1 = null;
            {
              long _long = rs.getLong("_sid");
              this._id = _long;
              String _string = rs.getString("_sname");
              this.subroutineName = _string;
              rs.close();
              _xblockexpression_1 = this;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Object _xblockexpression_2 = null;
            {
              rs.close();
              _xblockexpression_2 = null;
            }
            _xifexpression = ((NUOPCDriver.SetModelServices)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public TextFileChange forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
    
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SetModelServices: (id=");
      _builder.append(this._id, "");
      _builder.append(", subroutineName=");
      _builder.append(this.subroutineName, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  @Label("Initialization")
  public static class Initialization extends CodeConcept<NUOPCDriver.Initialization, NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.SetModelServices setModelServices;
    
    public Initialization(final NUOPCDriver parent, final CodeDBIndex codeDB) {
      super(parent, codeDB);
    }
    
    public NUOPCDriver.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.Initialization reverseChildren() {
      NUOPCDriver.Initialization _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices _setModelServices = new NUOPCDriver.SetModelServices(this, this._codeDB);
        NUOPCDriver.SetModelServices _reverse = _setModelServices.reverse();
        this.setModelServices = _reverse;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public TextFileChange forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
  }
  
  public static class SetModelCount extends CodeConcept<NUOPCDriver.SetModelCount, NUOPCDriver.Initialization, ASTSubroutineStmtNode> {
    public SetModelCount(final NUOPCDriver.Initialization parent, final CodeDBIndex codeDB) {
      super(parent, codeDB);
    }
    
    public NUOPCDriver.SetModelCount reverse() {
      try {
        NUOPCDriver.SetModelCount _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("esmf_specmethod(_sid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", _sname)");
          ResultSet rs = this.execQuery(_builder);
          NUOPCDriver.SetModelCount _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCDriver.SetModelCount _xblockexpression_1 = null;
            {
              long _long = rs.getLong("_sid");
              this._id = _long;
              rs.close();
              _xblockexpression_1 = this;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Object _xblockexpression_2 = null;
            {
              rs.close();
              _xblockexpression_2 = null;
            }
            _xifexpression = ((NUOPCDriver.SetModelCount)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public TextFileChange forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
  }
  
  public String driverName;
  
  @Name
  public String filename;
  
  public String path;
  
  @Label("ESMF Import")
  @Child
  public long standardESMFImportID = (-1);
  
  @Label("NUOPC Import")
  @Child
  public long standardNUOPCImportID = (-1);
  
  @Child
  public NUOPCDriver.SetServices setServices;
  
  @Child
  public NUOPCDriver.Initialization initialization;
  
  public NUOPCDriver(final CodeDBIndex codeDB) {
    super(null, codeDB);
  }
  
  public TextFileChange forward() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public NUOPCDriver reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module(_moduleID, _compUnitID, _driverName), ");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("compilationUnit(_compUnitID, _filename, _path),");
      _builder.newLine();
      _builder.append("   \t\t\t\t\t ");
      _builder.append("( uses(_uid, _mid, \'NUOPC_Driver\') ;");
      _builder.newLine();
      _builder.append("     \t\t\t\t   ");
      _builder.append("uses(_uid, _mid, \'NUOPC_DriverAtmOcn\') ).");
      ResultSet rs = this.execQuery(_builder);
      try {
        boolean _next = rs.next();
        if (_next) {
          long _long = rs.getLong("_moduleID");
          this._id = _long;
          String _string = rs.getString("_driverName");
          this.driverName = _string;
          String _string_1 = rs.getString("_filename");
          this.filename = _string_1;
          String _string_2 = rs.getString("_path");
          this.path = _string_2;
          rs.close();
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("uses(_uid, ");
          _builder_1.append(this._id, "");
          _builder_1.append(", \'ESMF\').");
          ResultSet _execQuery = this.execQuery(_builder_1);
          rs = _execQuery;
          boolean _next_1 = rs.next();
          if (_next_1) {
            long _long_1 = rs.getLong("_uid");
            this.standardESMFImportID = _long_1;
          }
          rs.close();
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("uses(_uid, ");
          _builder_2.append(this._id, "");
          _builder_2.append(", \'NUOPC\').");
          ResultSet _execQuery_1 = this.execQuery(_builder_2);
          rs = _execQuery_1;
          boolean _next_2 = rs.next();
          if (_next_2) {
            long _long_2 = rs.getLong("_uid");
            this.standardNUOPCImportID = _long_2;
          }
          rs.close();
          return this.reverseChildren();
        }
      } catch (final Throwable _t) {
        if (_t instanceof SQLException) {
          final SQLException e = (SQLException)_t;
          CupidActivator.log("SQL error", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = null;
    }
    return ((NUOPCDriver)_xblockexpression);
  }
  
  public NUOPCDriver reverseChildren() {
    NUOPCDriver _xblockexpression = null;
    {
      NUOPCDriver.SetServices _setServices = new NUOPCDriver.SetServices(this, this._codeDB);
      NUOPCDriver.SetServices _reverse = _setServices.reverse();
      this.setServices = _reverse;
      NUOPCDriver.Initialization _initialization = new NUOPCDriver.Initialization(this, this._codeDB);
      NUOPCDriver.Initialization _reverse_1 = _initialization.reverse();
      this.initialization = _reverse_1;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("NUOPCDriver2: (id = ");
    _builder.append(this._id, "");
    _builder.append(", driverName = ");
    _builder.append(this.driverName, "");
    _builder.append(", standardESMFImportID = ");
    _builder.append(this.standardESMFImportID, "");
    _builder.append(", standardNUOPCImportID = ");
    _builder.append(this.standardNUOPCImportID, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("setServices: ");
    _builder.append(this.setServices, "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
