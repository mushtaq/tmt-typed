package tmttyped.node

import org.scalablytyped.runtime.StringDictionary
import tmttyped.node.anon.End
import tmttyped.node.anon.Paths
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.eventsMod.global.NodeJS.EventEmitter
import tmttyped.std.BigInt64Array
import tmttyped.std.BigUint64Array
import tmttyped.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion borrowed
/*----------------------------------------------*
*                                               *
*               GLOBAL INTERFACES               *
*                                               *
*-----------------------------------------------*/
object NodeJS {
  
  type ArrayBufferView = TypedArray | js.typedarray.DataView
  
  trait CallSite extends StObject {
    
    /**
      * Current column number [if this function was defined in a script]
      */
    def getColumnNumber(): Double | Null
    
    /**
      * A call site object representing the location where eval was called
      * [if this function was created using a call to eval]
      */
    def getEvalOrigin(): js.UndefOr[java.lang.String]
    
    /**
      * Name of the script [if this function was defined in a script]
      */
    def getFileName(): java.lang.String | Null
    
    /**
      * Current function
      */
    def getFunction(): js.UndefOr[js.Function]
    
    /**
      * Name of the current function, typically its name property.
      * If a name property is not available an attempt will be made to try
      * to infer a name from the function's context.
      */
    def getFunctionName(): java.lang.String | Null
    
    /**
      * Current line number [if this function was defined in a script]
      */
    def getLineNumber(): Double | Null
    
    /**
      * Name of the property [of "this" or one of its prototypes] that holds
      * the current function
      */
    def getMethodName(): java.lang.String | Null
    
    /**
      * Value of "this"
      */
    def getThis(): js.Any
    
    /**
      * Type of "this" as a string.
      * This is the name of the function stored in the constructor field of
      * "this", if available.  Otherwise the object's [[Class]] internal
      * property.
      */
    def getTypeName(): java.lang.String | Null
    
    /**
      * Is this a constructor call?
      */
    def isConstructor(): Boolean
    
    /**
      * Does this call take place in code defined by a call to eval?
      */
    def isEval(): Boolean
    
    /**
      * Is this call in native V8 code?
      */
    def isNative(): Boolean
    
    /**
      * Is this a toplevel invocation, that is, is "this" the global object?
      */
    def isToplevel(): Boolean
  }
  object CallSite {
    
    @scala.inline
    def apply(
      getColumnNumber: () => Double | Null,
      getEvalOrigin: () => js.UndefOr[java.lang.String],
      getFileName: () => java.lang.String | Null,
      getFunction: () => js.UndefOr[js.Function],
      getFunctionName: () => java.lang.String | Null,
      getLineNumber: () => Double | Null,
      getMethodName: () => java.lang.String | Null,
      getThis: () => js.Any,
      getTypeName: () => java.lang.String | Null,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    @scala.inline
    implicit class CallSiteMutableBuilder[Self <: CallSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => js.UndefOr[java.lang.String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => java.lang.String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMethodName(value: () => java.lang.String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThis(value: () => js.Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeName(value: () => java.lang.String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
  
  type Dict[T] = StringDictionary[js.UndefOr[T]]
  
  trait ErrnoException
    extends StObject
       with Error {
    
    var code: js.UndefOr[java.lang.String] = js.undefined
    
    var errno: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    var syscall: js.UndefOr[java.lang.String] = js.undefined
  }
  object ErrnoException {
    
    @scala.inline
    def apply(message: java.lang.String, name: java.lang.String): ErrnoException = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrnoException]
    }
    
    @scala.inline
    implicit class ErrnoExceptionMutableBuilder[Self <: ErrnoException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrnoUndefined: Self = StObject.set(x, "errno", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSyscall(value: java.lang.String): Self = StObject.set(x, "syscall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyscallUndefined: Self = StObject.set(x, "syscall", js.undefined)
    }
  }
  
  trait Module extends StObject {
    
    var children: js.Array[Module]
    
    var exports: js.Any
    
    var filename: java.lang.String
    
    var id: java.lang.String
    
    /**
      * `true` if the module is running during the Node.js preload
      */
    var isPreloading: Boolean
    
    var loaded: Boolean
    
    /** @deprecated since 14.6.0 Please use `require.main` and `module.children` instead. */
    var parent: js.UndefOr[Module | Null] = js.undefined
    
    /**
      * @since 11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    var path: java.lang.String
    
    var paths: js.Array[java.lang.String]
    
    def require(id: java.lang.String): js.Any
    @JSName("require")
    var require_Original: Require
  }
  object Module {
    
    @scala.inline
    def apply(
      children: js.Array[Module],
      exports: js.Any,
      filename: java.lang.String,
      id: java.lang.String,
      isPreloading: Boolean,
      loaded: Boolean,
      path: java.lang.String,
      paths: js.Array[java.lang.String],
      require: Require
    ): Module = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isPreloading = isPreloading.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Module]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: Module*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: java.lang.String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPreloading(value: Boolean): Self = StObject.set(x, "isPreloading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Module): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: js.Array[java.lang.String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: java.lang.String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setRequire(value: Require): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    }
  }
  
  type ReadOnlyDict[T] = StringDictionary[js.UndefOr[T]]
  
  @js.native
  trait ReadWriteStream
    extends StObject
       with ReadableStream
       with WritableStream
  
  @js.native
  trait ReadableStream
    extends StObject
       with EventEmitter {
    
    def isPaused(): Boolean = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def read(): java.lang.String | Buffer = js.native
    def read(size: Double): java.lang.String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: java.lang.String): Unit = js.native
    def unshift(chunk: java.lang.String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array): Unit = js.native
    def unshift(chunk: js.typedarray.Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
  
  trait RefCounted extends StObject {
    
    def ref(): this.type
    
    def unref(): this.type
  }
  object RefCounted {
    
    @scala.inline
    def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[RefCounted]
    }
    
    @scala.inline
    implicit class RefCountedMutableBuilder[Self <: RefCounted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: () => RefCounted): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => RefCounted): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Require extends StObject {
    
    def apply(id: java.lang.String): js.Any = js.native
    
    var cache: Dict[NodeModule] = js.native
    
    /**
      * @deprecated
      */
    var extensions: RequireExtensions = js.native
    
    var main: js.UndefOr[Module] = js.native
    
    def resolve(id: java.lang.String): java.lang.String = js.native
    def resolve(id: java.lang.String, options: Paths): java.lang.String = js.native
    @JSName("resolve")
    var resolve_Original: tmttyped.node.NodeJS.RequireResolve = js.native
  }
  
  trait RequireExtensions
    extends StObject
       with Dict[js.Function2[/* m */ Module, /* filename */ java.lang.String, js.Any]] {
    
    @JSName(".js")
    def Dotjs(m: Module, filename: java.lang.String): js.Any
    
    @JSName(".json")
    def Dotjson(m: Module, filename: java.lang.String): js.Any
    
    @JSName(".node")
    def Dotnode(m: Module, filename: java.lang.String): js.Any
  }
  object RequireExtensions {
    
    @scala.inline
    def apply(
      Dotjs: (Module, java.lang.String) => js.Any,
      Dotjson: (Module, java.lang.String) => js.Any,
      Dotnode: (Module, java.lang.String) => js.Any
    ): RequireExtensions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(".js")(js.Any.fromFunction2(Dotjs))
      __obj.updateDynamic(".json")(js.Any.fromFunction2(Dotjson))
      __obj.updateDynamic(".node")(js.Any.fromFunction2(Dotnode))
      __obj.asInstanceOf[RequireExtensions]
    }
    
    @scala.inline
    implicit class RequireExtensionsMutableBuilder[Self <: RequireExtensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotjs(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".js", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotjson(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".json", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDotnode(value: (Module, java.lang.String) => js.Any): Self = StObject.set(x, ".node", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait RequireResolve extends StObject {
    
    def apply(id: java.lang.String): java.lang.String = js.native
    def apply(id: java.lang.String, options: Paths): java.lang.String = js.native
    
    def paths(request: java.lang.String): js.Array[java.lang.String] | Null = js.native
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | BigUint64Array | BigInt64Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  @js.native
  trait WritableStream
    extends StObject
       with EventEmitter {
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(data: java.lang.String): Unit = js.native
    def end(data: java.lang.String, cb: js.Function0[Unit]): Unit = js.native
    def end(data: js.typedarray.Uint8Array): Unit = js.native
    def end(data: js.typedarray.Uint8Array, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: Unit, cb: js.Function0[Unit]): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding): Unit = js.native
    def end(str: java.lang.String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    var writable: Boolean = js.native
    
    def write(buffer: java.lang.String): Boolean = js.native
    def write(buffer: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
    def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(
      str: java.lang.String,
      encoding: Unit,
      cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
    def write(str: java.lang.String, encoding: BufferEncoding): Boolean = js.native
    def write(
      str: java.lang.String,
      encoding: BufferEncoding,
      cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
}
