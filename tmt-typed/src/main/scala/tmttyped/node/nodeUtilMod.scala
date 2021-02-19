package tmttyped.node

import tmttyped.node.NodeJS.Dict
import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.anon.Fatal
import tmttyped.node.utilMod.CustomPromisify
import tmttyped.node.utilMod.InspectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilMod {
  
  @JSImport("node:util", "TextDecoder")
  @js.native
  class TextDecoder ()
    extends tmttyped.node.utilMod.TextDecoder {
    def this(encoding: java.lang.String) = this()
    def this(encoding: js.UndefOr[scala.Nothing], options: Fatal) = this()
    def this(encoding: java.lang.String, options: Fatal) = this()
  }
  
  @JSImport("node:util", "TextEncoder")
  @js.native
  class TextEncoder ()
    extends tmttyped.node.utilMod.TextEncoder
  
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify(fn: js.Function0[js.Promise[Unit]]): js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify[T1](fn: js.Function1[/* arg1 */ T1, js.Promise[Unit]]): js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify[T1, T2, T3, T4](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify[T1, T2, T3, T4, T5](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[Unit]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify[T1, T2, T3, T4, T5, T6](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[Unit]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_T1T2T3T4T5T6TResult[T1, T2, T3, T4, T5, T6, TResult](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      js.Promise[TResult]
    ]
  ): js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_T1T2T3T4T5TResult[T1, T2, T3, T4, T5, TResult](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      js.Promise[TResult]
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, js.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  @JSImport("node:util", "callbackify")
  @js.native
  def callbackify_TResult[TResult](fn: js.Function0[js.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = js.native
  
  @JSImport("node:util", "debuglog")
  @js.native
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, Unit] = js.native
  
  @JSImport("node:util", "deprecate")
  @js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = js.native
  @JSImport("node:util", "deprecate")
  @js.native
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String, code: java.lang.String): T = js.native
  
  @JSImport("node:util", "format")
  @js.native
  def format(format: js.UndefOr[scala.Nothing], param: js.Any*): java.lang.String = js.native
  @JSImport("node:util", "format")
  @js.native
  def format(format: js.Any, param: js.Any*): java.lang.String = js.native
  
  @JSImport("node:util", "formatWithOptions")
  @js.native
  def formatWithOptions(inspectOptions: InspectOptions, format: js.UndefOr[scala.Nothing], param: js.Any*): java.lang.String = js.native
  @JSImport("node:util", "formatWithOptions")
  @js.native
  def formatWithOptions(inspectOptions: InspectOptions, format: js.Any, param: js.Any*): java.lang.String = js.native
  
  @JSImport("node:util", "inherits")
  @js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  
  object inspect {
    
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, options: InspectOptions): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(
      `object`: js.Any,
      showHidden: js.UndefOr[scala.Nothing],
      depth: js.UndefOr[scala.Nothing],
      color: Boolean
    ): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double, color: Boolean): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Null, color: Boolean): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: js.UndefOr[scala.Nothing], color: Boolean): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    def apply(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = js.native
    @JSImport("node:util", "inspect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:util", "inspect.colors")
    @js.native
    def colors: Dict[js.Tuple2[Double, Double]] = js.native
    @scala.inline
    def colors_=(x: Dict[js.Tuple2[Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("node:util", "inspect.custom")
    @js.native
    val custom: js.Symbol = js.native
    
    @JSImport("node:util", "inspect.defaultOptions")
    @js.native
    def defaultOptions: InspectOptions = js.native
    @scala.inline
    def defaultOptions_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Allows changing inspect settings from the repl.
      */
    @JSImport("node:util", "inspect.replDefaults")
    @js.native
    def replDefaults: InspectOptions = js.native
    @scala.inline
    def replDefaults_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replDefaults")(x.asInstanceOf[js.Any])
    
    /* Inlined {[ K in node.util.Style ]: string} */
    object styles {
      
      @JSImport("node:util", "inspect.styles")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("node:util", "inspect.styles.bigint")
      @js.native
      def bigint: java.lang.String = js.native
      @scala.inline
      def bigint_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigint")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.boolean")
      @js.native
      def boolean: java.lang.String = js.native
      @scala.inline
      def boolean_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.date")
      @js.native
      def date: java.lang.String = js.native
      @scala.inline
      def date_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.module")
      @js.native
      def module: java.lang.String = js.native
      @scala.inline
      def module_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.number")
      @js.native
      def number: java.lang.String = js.native
      @scala.inline
      def number_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.regexp")
      @js.native
      def regexp: java.lang.String = js.native
      @scala.inline
      def regexp_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.special")
      @js.native
      def special: java.lang.String = js.native
      @scala.inline
      def special_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("special")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.string")
      @js.native
      def string: java.lang.String = js.native
      @scala.inline
      def string_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.symbol")
      @js.native
      def symbol: java.lang.String = js.native
      @scala.inline
      def symbol_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.undefined")
      @js.native
      def undefined: java.lang.String = js.native
      @scala.inline
      def undefined_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
      
      @JSImport("node:util", "inspect.styles.null")
      @js.native
      val `null`: java.lang.String = js.native
    }
  }
  
  /** @deprecated since v4.0.0 - use `Array.isArray()` instead. */
  @JSImport("node:util", "isArray")
  @js.native
  def isArray(`object`: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'boolean'` instead. */
  @JSImport("node:util", "isBoolean")
  @js.native
  def isBoolean(`object`: js.Any): /* is boolean */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `Buffer.isBuffer()` instead. */
  @JSImport("node:util", "isBuffer")
  @js.native
  def isBuffer(`object`: js.Any): /* is node.Buffer */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `util.types.isDate()` instead. */
  @JSImport("node:util", "isDate")
  @js.native
  def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("node:util", "isDeepStrictEqual")
  @js.native
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `util.types.isNativeError()` instead. */
  @JSImport("node:util", "isError")
  @js.native
  def isError(`object`: js.Any): /* is std.Error */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'function'` instead. */
  @JSImport("node:util", "isFunction")
  @js.native
  def isFunction(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value === null` instead. */
  @JSImport("node:util", "isNull")
  @js.native
  def isNull(`object`: js.Any): /* is null */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value === null || value === undefined` instead. */
  @JSImport("node:util", "isNullOrUndefined")
  @js.native
  def isNullOrUndefined(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'number'` instead. */
  @JSImport("node:util", "isNumber")
  @js.native
  def isNumber(`object`: js.Any): /* is number */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value !== null && typeof value === 'object'` instead. */
  @JSImport("node:util", "isObject")
  @js.native
  def isObject(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead. */
  @JSImport("node:util", "isPrimitive")
  @js.native
  def isPrimitive(`object`: js.Any): Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `util.types.isRegExp()` instead. */
  @JSImport("node:util", "isRegExp")
  @js.native
  def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'string'` instead. */
  @JSImport("node:util", "isString")
  @js.native
  def isString(`object`: js.Any): /* is string */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `typeof value === 'symbol'` instead. */
  @JSImport("node:util", "isSymbol")
  @js.native
  def isSymbol(`object`: js.Any): /* is symbol */ Boolean = js.native
  
  /** @deprecated since v4.0.0 - use `value === undefined` instead. */
  @JSImport("node:util", "isUndefined")
  @js.native
  def isUndefined(`object`: js.Any): /* is undefined */ Boolean = js.native
  
  /** @deprecated since v0.11.3 - use a third party module instead. */
  @JSImport("node:util", "log")
  @js.native
  def log(string: java.lang.String): Unit = js.native
  
  object promisify {
    
    @JSImport("node:util", "promisify")
    @js.native
    def apply(fn: js.Function): js.Function = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply[T1](
      fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
    ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply[T1, T2](
      fn: js.Function3[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply[T1, T2, T3](
      fn: js.Function4[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply[T1, T2, T3, T4](
      fn: js.Function5[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
    @JSImport("node:util", "promisify")
    @js.native
    def apply[T1, T2, T3, T4, T5](
      fn: js.Function6[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* arg5 */ T5, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function5[
        /* arg1 */ T1, 
        /* arg2 */ T2, 
        /* arg3 */ T3, 
        /* arg4 */ T4, 
        /* arg5 */ T5, 
        js.Promise[Unit]
      ] = js.native
    
    @JSImport("node:util", "promisify.custom")
    @js.native
    val custom: js.Symbol = js.native
  }
  
  object types {
    
    @JSImport("node:util", "types.isAnyArrayBuffer")
    @js.native
    def isAnyArrayBuffer(`object`: js.Any): /* is std.ArrayBufferLike */ Boolean = js.native
    
    @JSImport("node:util", "types.isArgumentsObject")
    @js.native
    def isArgumentsObject(`object`: js.Any): /* is std.IArguments */ Boolean = js.native
    
    @JSImport("node:util", "types.isArrayBuffer")
    @js.native
    def isArrayBuffer(`object`: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
    
    @JSImport("node:util", "types.isArrayBufferView")
    @js.native
    def isArrayBufferView(`object`: js.Any): /* is node.NodeJS.ArrayBufferView */ Boolean = js.native
    
    @JSImport("node:util", "types.isAsyncFunction")
    @js.native
    def isAsyncFunction(`object`: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isBigInt64Array")
    @js.native
    def isBigInt64Array(value: js.Any): /* is std.BigInt64Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isBigUint64Array")
    @js.native
    def isBigUint64Array(value: js.Any): /* is std.BigUint64Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isBooleanObject")
    @js.native
    def isBooleanObject(`object`: js.Any): /* is std.Boolean */ Boolean = js.native
    
    @JSImport("node:util", "types.isBoxedPrimitive")
    @js.native
    def isBoxedPrimitive(`object`: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isDataView")
    @js.native
    def isDataView(`object`: js.Any): /* is std.DataView */ Boolean = js.native
    
    @JSImport("node:util", "types.isDate")
    @js.native
    def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
    
    @JSImport("node:util", "types.isExternal")
    @js.native
    def isExternal(`object`: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isFloat32Array")
    @js.native
    def isFloat32Array(`object`: js.Any): /* is std.Float32Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isFloat64Array")
    @js.native
    def isFloat64Array(`object`: js.Any): /* is std.Float64Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isGeneratorFunction")
    @js.native
    def isGeneratorFunction(`object`: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
    
    @JSImport("node:util", "types.isGeneratorObject")
    @js.native
    def isGeneratorObject(`object`: js.Any): /* is std.Generator<unknown, any, unknown> */ Boolean = js.native
    
    @JSImport("node:util", "types.isInt16Array")
    @js.native
    def isInt16Array(`object`: js.Any): /* is std.Int16Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isInt32Array")
    @js.native
    def isInt32Array(`object`: js.Any): /* is std.Int32Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isInt8Array")
    @js.native
    def isInt8Array(`object`: js.Any): /* is std.Int8Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isMap")
    @js.native
    def isMap[T](`object`: T): Boolean = js.native
    @JSImport("node:util", "types.isMap")
    @js.native
    def isMap[T](`object`: js.Object): Boolean = js.native
    
    @JSImport("node:util", "types.isMapIterator")
    @js.native
    def isMapIterator(`object`: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isModuleNamespaceObject")
    @js.native
    def isModuleNamespaceObject(value: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isNativeError")
    @js.native
    def isNativeError(`object`: js.Any): /* is std.Error */ Boolean = js.native
    
    @JSImport("node:util", "types.isNumberObject")
    @js.native
    def isNumberObject(`object`: js.Any): /* is std.Number */ Boolean = js.native
    
    @JSImport("node:util", "types.isPromise")
    @js.native
    def isPromise(`object`: js.Any): /* is std.Promise<any> */ Boolean = js.native
    
    @JSImport("node:util", "types.isProxy")
    @js.native
    def isProxy(`object`: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isRegExp")
    @js.native
    def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
    
    @JSImport("node:util", "types.isSet")
    @js.native
    def isSet[T](`object`: T): Boolean = js.native
    @JSImport("node:util", "types.isSet")
    @js.native
    def isSet[T](`object`: js.Object): Boolean = js.native
    
    @JSImport("node:util", "types.isSetIterator")
    @js.native
    def isSetIterator(`object`: js.Any): Boolean = js.native
    
    @JSImport("node:util", "types.isSharedArrayBuffer")
    @js.native
    def isSharedArrayBuffer(`object`: js.Any): /* is std.SharedArrayBuffer */ Boolean = js.native
    
    @JSImport("node:util", "types.isStringObject")
    @js.native
    def isStringObject(`object`: js.Any): /* is node.String */ Boolean = js.native
    
    @JSImport("node:util", "types.isSymbolObject")
    @js.native
    def isSymbolObject(`object`: js.Any): /* is std.Symbol */ Boolean = js.native
    
    @JSImport("node:util", "types.isTypedArray")
    @js.native
    def isTypedArray(`object`: js.Any): /* is node.NodeJS.TypedArray */ Boolean = js.native
    
    @JSImport("node:util", "types.isUint16Array")
    @js.native
    def isUint16Array(`object`: js.Any): /* is std.Uint16Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isUint32Array")
    @js.native
    def isUint32Array(`object`: js.Any): /* is std.Uint32Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isUint8Array")
    @js.native
    def isUint8Array(`object`: js.Any): /* is std.Uint8Array */ Boolean = js.native
    
    @JSImport("node:util", "types.isUint8ClampedArray")
    @js.native
    def isUint8ClampedArray(`object`: js.Any): /* is std.Uint8ClampedArray */ Boolean = js.native
    
    @JSImport("node:util", "types.isWeakMap")
    @js.native
    def isWeakMap(`object`: js.Any): /* is std.WeakMap<any, any> */ Boolean = js.native
    
    @JSImport("node:util", "types.isWeakSet")
    @js.native
    def isWeakSet(`object`: js.Any): /* is std.WeakSet<any> */ Boolean = js.native
  }
}
