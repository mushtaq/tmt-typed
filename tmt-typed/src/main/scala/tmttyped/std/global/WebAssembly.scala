package tmttyped.std.global

import tmttyped.std.BufferSource
import tmttyped.std.WebAssembly.Exports
import tmttyped.std.WebAssembly.Global
import tmttyped.std.WebAssembly.GlobalDescriptor
import tmttyped.std.WebAssembly.Imports
import tmttyped.std.WebAssembly.Instance
import tmttyped.std.WebAssembly.Memory
import tmttyped.std.WebAssembly.MemoryDescriptor
import tmttyped.std.WebAssembly.Module
import tmttyped.std.WebAssembly.ModuleExportDescriptor
import tmttyped.std.WebAssembly.ModuleImportDescriptor
import tmttyped.std.WebAssembly.Table
import tmttyped.std.WebAssembly.TableDescriptor
import tmttyped.std.WebAssembly.WebAssemblyInstantiatedSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @JSGlobal("WebAssembly")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  inline def CompileError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("CompileError")().asInstanceOf[js.Error]
  inline def CompileError(message: java.lang.String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("CompileError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  /* standard DOM */
  open class CompileErrorCls ()
    extends StObject
       with tmttyped.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  open class GlobalCls protected ()
    extends StObject
       with Global {
    /* standard DOM */
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: Any) = this()
    
    /* standard DOM */
    /* CompleteClass */
    var value: Any = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  open class InstanceCls protected ()
    extends StObject
       with Instance {
    /* standard DOM */
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
    
    /* standard DOM */
    /* CompleteClass */
    override val exports: Exports = js.native
  }
  
  /* standard DOM */
  inline def LinkError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkError")().asInstanceOf[js.Error]
  inline def LinkError(message: java.lang.String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  /* standard DOM */
  open class LinkErrorCls ()
    extends StObject
       with tmttyped.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  open class MemoryCls protected ()
    extends StObject
       with Memory {
    /* standard DOM */
    def this(descriptor: MemoryDescriptor) = this()
    
    /* standard DOM */
    /* CompleteClass */
    override val buffer: js.typedarray.ArrayBuffer = js.native
    
    /* standard DOM */
    /* CompleteClass */
    override def grow(delta: Double): Double = js.native
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard DOM */
    inline def customSections(moduleObject: tmttyped.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("customSections")(moduleObject.asInstanceOf[js.Any], sectionName.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.ArrayBuffer]]
    
    /* standard DOM */
    inline def exports(moduleObject: tmttyped.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleExportDescriptor]]
    
    /* standard DOM */
    inline def imports(moduleObject: tmttyped.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleImportDescriptor]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  open class ModuleCls protected ()
    extends StObject
       with Module {
    /* standard DOM */
    def this(bytes: BufferSource) = this()
  }
  
  /* standard DOM */
  inline def RuntimeError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("RuntimeError")().asInstanceOf[js.Error]
  inline def RuntimeError(message: java.lang.String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("RuntimeError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  /* standard DOM */
  open class RuntimeErrorCls ()
    extends StObject
       with tmttyped.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  open class TableCls protected ()
    extends StObject
       with Table {
    /* standard DOM */
    def this(descriptor: TableDescriptor) = this()
    def this(descriptor: TableDescriptor, value: Any) = this()
  }
  
  inline def compile(bytes: BufferSource): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  inline def compileStreaming(source: js.Thenable[org.scalajs.dom.Response]): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  inline def compileStreaming(source: org.scalajs.dom.Response): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  inline def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiate(moduleObject: Module): js.Promise[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Instance]]
  inline def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Instance]]
  
  inline def instantiateStreaming(source: js.Thenable[org.scalajs.dom.Response]): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: js.Thenable[org.scalajs.dom.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: org.scalajs.dom.Response): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: org.scalajs.dom.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  
  inline def validate(bytes: BufferSource): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
