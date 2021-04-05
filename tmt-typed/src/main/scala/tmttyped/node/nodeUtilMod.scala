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
  
  @JSImport("node:util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def callbackify(fn: js.Function0[js.Promise[Unit]]): js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit]]
  @scala.inline
  def callbackify[T1](fn: js.Function1[/* arg1 */ T1, js.Promise[Unit]]): js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ ErrnoException, Unit], Unit]]
  @scala.inline
  def callbackify[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  @scala.inline
  def callbackify[T1, T2, T3](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  @scala.inline
  def callbackify[T1, T2, T3, T4](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function1[/* err */ ErrnoException, Unit], 
    Unit
  ]]
  
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function7[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
  def callbackify_T1T2T3T4TResult[T1, T2, T3, T4, TResult](fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[TResult]]): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
  def callbackify_T1T2T3TResult[T1, T2, T3, TResult](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[TResult]]): js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
  def callbackify_T1T2TResult[T1, T2, TResult](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[TResult]]): js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
  def callbackify_T1TResult[T1, TResult](fn: js.Function1[/* arg1 */ T1, js.Promise[TResult]]): js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* arg1 */ T1, 
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
  def callbackify_TResult[TResult](fn: js.Function0[js.Promise[TResult]]): js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* callback */ js.Function2[/* err */ ErrnoException, /* result */ TResult, Unit], 
    Unit
  ]]
  
  @scala.inline
  def debuglog(key: java.lang.String): js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debuglog")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* msg */ java.lang.String, /* repeated */ js.Any, Unit]]
  
  @scala.inline
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(fn.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def deprecate[T /* <: js.Function */](fn: T, message: java.lang.String, code: java.lang.String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(fn.asInstanceOf[js.Any], message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def format(format: js.UndefOr[scala.Nothing], param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(format: js.Any, param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatWithOptions(inspectOptions: InspectOptions, format: js.UndefOr[scala.Nothing], param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithOptions")(inspectOptions.asInstanceOf[js.Any], format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatWithOptions(inspectOptions: InspectOptions, format: js.Any, param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithOptions")(inspectOptions.asInstanceOf[js.Any], format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object inspect {
    
    @scala.inline
    def apply(`object`: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, options: InspectOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(
      `object`: js.Any,
      showHidden: js.UndefOr[scala.Nothing],
      depth: js.UndefOr[scala.Nothing],
      color: Boolean
    ): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Null, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: js.UndefOr[scala.Nothing], color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
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
      
      @JSImport("node:util", "inspect.styles.null")
      @js.native
      val `null`: java.lang.String = js.native
      
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
    }
  }
  
  /** @deprecated since v4.0.0 - use `Array.isArray()` instead. */
  @scala.inline
  def isArray(`object`: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  /** @deprecated since v4.0.0 - use `typeof value === 'boolean'` instead. */
  @scala.inline
  def isBoolean(`object`: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  /** @deprecated since v4.0.0 - use `Buffer.isBuffer()` instead. */
  @scala.inline
  def isBuffer(`object`: js.Any): /* is node.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.Buffer */ Boolean]
  
  /** @deprecated since v4.0.0 - use `util.types.isDate()` instead. */
  @scala.inline
  def isDate(`object`: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @scala.inline
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepStrictEqual")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** @deprecated since v4.0.0 - use `util.types.isNativeError()` instead. */
  @scala.inline
  def isError(`object`: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  /** @deprecated since v4.0.0 - use `typeof value === 'function'` instead. */
  @scala.inline
  def isFunction(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** @deprecated since v4.0.0 - use `value === null` instead. */
  @scala.inline
  def isNull(`object`: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  /** @deprecated since v4.0.0 - use `value === null || value === undefined` instead. */
  @scala.inline
  def isNullOrUndefined(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** @deprecated since v4.0.0 - use `typeof value === 'number'` instead. */
  @scala.inline
  def isNumber(`object`: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  /** @deprecated since v4.0.0 - use `value !== null && typeof value === 'object'` instead. */
  @scala.inline
  def isObject(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** @deprecated since v4.0.0 - use `(typeof value !== 'object' && typeof value !== 'function') || value === null` instead. */
  @scala.inline
  def isPrimitive(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** @deprecated since v4.0.0 - use `util.types.isRegExp()` instead. */
  @scala.inline
  def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  /** @deprecated since v4.0.0 - use `typeof value === 'string'` instead. */
  @scala.inline
  def isString(`object`: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  /** @deprecated since v4.0.0 - use `typeof value === 'symbol'` instead. */
  @scala.inline
  def isSymbol(`object`: js.Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  /** @deprecated since v4.0.0 - use `value === undefined` instead. */
  @scala.inline
  def isUndefined(`object`: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  /** @deprecated since v0.11.3 - use a third party module instead. */
  @scala.inline
  def log(string: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object promisify {
    
    @scala.inline
    def apply(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    @scala.inline
    def apply(fn: js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
    @scala.inline
    def apply[T1](
      fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
    ): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ T1, js.Promise[Unit]]]
    @scala.inline
    def apply[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[TCustom]
    @scala.inline
    def apply[T1, T2](
      fn: js.Function3[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]]]
    @scala.inline
    def apply[T1, T2, T3](
      fn: js.Function4[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]]]
    @scala.inline
    def apply[T1, T2, T3, T4](
      fn: js.Function5[
          /* arg1 */ T1, 
          /* arg2 */ T2, 
          /* arg3 */ T3, 
          /* arg4 */ T4, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]]]
    @scala.inline
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
      ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
        /* arg1 */ T1, 
        /* arg2 */ T2, 
        /* arg3 */ T3, 
        /* arg4 */ T4, 
        /* arg5 */ T5, 
        js.Promise[Unit]
      ]]
    
    @JSImport("node:util", "promisify")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:util", "promisify.custom")
    @js.native
    val custom: js.Symbol = js.native
  }
  
  object types {
    
    @JSImport("node:util", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isAnyArrayBuffer(`object`: js.Any): /* is std.ArrayBufferLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyArrayBuffer")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBufferLike */ Boolean]
    
    @scala.inline
    def isArgumentsObject(`object`: js.Any): /* is std.IArguments */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentsObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.IArguments */ Boolean]
    
    @scala.inline
    def isArrayBuffer(`object`: js.Any): /* is std.ArrayBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBuffer")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBuffer */ Boolean]
    
    @scala.inline
    def isArrayBufferView(`object`: js.Any): /* is node.NodeJS.ArrayBufferView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBufferView")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.NodeJS.ArrayBufferView */ Boolean]
    
    @scala.inline
    def isAsyncFunction(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsyncFunction")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isBigInt64Array(value: js.Any): /* is std.BigInt64Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigInt64Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.BigInt64Array */ Boolean]
    
    @scala.inline
    def isBigUint64Array(value: js.Any): /* is std.BigUint64Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigUint64Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.BigUint64Array */ Boolean]
    
    @scala.inline
    def isBooleanObject(`object`: js.Any): /* is std.Boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Boolean */ Boolean]
    
    @scala.inline
    def isBoxedPrimitive(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoxedPrimitive")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isDataView(`object`: js.Any): /* is std.DataView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataView")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.DataView */ Boolean]
    
    @scala.inline
    def isDate(`object`: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    @scala.inline
    def isExternal(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternal")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isFloat32Array(`object`: js.Any): /* is std.Float32Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFloat32Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Float32Array */ Boolean]
    
    @scala.inline
    def isFloat64Array(`object`: js.Any): /* is std.Float64Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFloat64Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Float64Array */ Boolean]
    
    @scala.inline
    def isGeneratorFunction(`object`: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
    
    @scala.inline
    def isGeneratorObject(`object`: js.Any): /* is std.Generator<unknown, any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Generator<unknown, any, unknown> */ Boolean]
    
    @scala.inline
    def isInt16Array(`object`: js.Any): /* is std.Int16Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt16Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Int16Array */ Boolean]
    
    @scala.inline
    def isInt32Array(`object`: js.Any): /* is std.Int32Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt32Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Int32Array */ Boolean]
    
    @scala.inline
    def isInt8Array(`object`: js.Any): /* is std.Int8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt8Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Int8Array */ Boolean]
    
    @scala.inline
    def isMap[T](`object`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def isMap[T](`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isMapIterator(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapIterator")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isModuleNamespaceObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleNamespaceObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isNativeError(`object`: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeError")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
    
    @scala.inline
    def isNumberObject(`object`: js.Any): /* is std.Number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Number */ Boolean]
    
    @scala.inline
    def isPromise(`object`: js.Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
    
    @scala.inline
    def isProxy(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxy")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
    
    @scala.inline
    def isSet[T](`object`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def isSet[T](`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSetIterator(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetIterator")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSharedArrayBuffer(`object`: js.Any): /* is std.SharedArrayBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSharedArrayBuffer")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.SharedArrayBuffer */ Boolean]
    
    @scala.inline
    def isStringObject(`object`: js.Any): /* is node.String */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.String */ Boolean]
    
    @scala.inline
    def isSymbolObject(`object`: js.Any): /* is std.Symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Symbol */ Boolean]
    
    @scala.inline
    def isTypedArray(`object`: js.Any): /* is node.NodeJS.TypedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.NodeJS.TypedArray */ Boolean]
    
    @scala.inline
    def isUint16Array(`object`: js.Any): /* is std.Uint16Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint16Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint16Array */ Boolean]
    
    @scala.inline
    def isUint32Array(`object`: js.Any): /* is std.Uint32Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint32Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint32Array */ Boolean]
    
    @scala.inline
    def isUint8Array(`object`: js.Any): /* is std.Uint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint8Array")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8Array */ Boolean]
    
    @scala.inline
    def isUint8ClampedArray(`object`: js.Any): /* is std.Uint8ClampedArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint8ClampedArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8ClampedArray */ Boolean]
    
    @scala.inline
    def isWeakMap(`object`: js.Any): /* is std.WeakMap<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeakMap")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakMap<any, any> */ Boolean]
    
    @scala.inline
    def isWeakSet(`object`: js.Any): /* is std.WeakSet<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeakSet")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakSet<any> */ Boolean]
  }
}
