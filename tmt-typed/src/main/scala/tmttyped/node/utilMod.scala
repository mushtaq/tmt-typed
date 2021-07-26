package tmttyped.node

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.NodeJS.Dict
import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.anon.Fatal
import tmttyped.node.anon.Stream
import tmttyped.node.nodeStrings.get
import tmttyped.node.nodeStrings.set
import tmttyped.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("util", "TextDecoder")
  @js.native
  class TextDecoder () extends StObject {
    def this(encoding: java.lang.String) = this()
    def this(encoding: java.lang.String, options: Fatal) = this()
    def this(encoding: Unit, options: Fatal) = this()
    
    /**
      * Decodes the `input` and returns a string. If `options.stream` is `true`, any
      * incomplete byte sequences occurring at the end of the `input` are buffered
      * internally and emitted after the next call to `textDecoder.decode()`.
      *
      * If `textDecoder.fatal` is `true`, decoding errors that occur will result in a`TypeError` being thrown.
      * @param input An `ArrayBuffer`, `DataView` or `TypedArray` instance containing the encoded data.
      */
    def decode(): java.lang.String = js.native
    def decode(input: js.typedarray.ArrayBuffer): java.lang.String = js.native
    def decode(input: js.typedarray.ArrayBuffer, options: Stream): java.lang.String = js.native
    def decode(input: Null, options: Stream): java.lang.String = js.native
    def decode(input: Unit, options: Stream): java.lang.String = js.native
    def decode(input: ArrayBufferView): java.lang.String = js.native
    def decode(input: ArrayBufferView, options: Stream): java.lang.String = js.native
    
    /**
      * The encoding supported by the `TextDecoder` instance.
      */
    val encoding: java.lang.String = js.native
    
    /**
      * The value will be `true` if decoding errors result in a `TypeError` being
      * thrown.
      */
    val fatal: Boolean = js.native
    
    /**
      * The value will be `true` if the decoding result will include the byte order
      * mark.
      */
    val ignoreBOM: Boolean = js.native
  }
  
  @JSImport("util", "TextEncoder")
  @js.native
  class TextEncoder () extends StObject {
    
    /**
      * UTF-8 encodes the `input` string and returns a `Uint8Array` containing the
      * encoded bytes.
      * @param input The text to encode.
      */
    def encode(): js.typedarray.Uint8Array = js.native
    def encode(input: java.lang.String): js.typedarray.Uint8Array = js.native
    
    /**
      * UTF-8 encodes the `src` string to the `dest` Uint8Array and returns an object
      * containing the read Unicode code units and written UTF-8 bytes.
      *
      * ```js
      * const encoder = new TextEncoder();
      * const src = 'this is some data';
      * const dest = new Uint8Array(10);
      * const { read, written } = encoder.encodeInto(src, dest);
      * ```
      * @param src The text to encode.
      * @param dest The array to hold the encode result.
      */
    def encodeInto(input: java.lang.String, output: js.typedarray.Uint8Array): EncodeIntoResult = js.native
    
    /**
      * The encoding supported by the `TextEncoder` instance. Always set to `'utf-8'`.
      */
    val encoding: java.lang.String = js.native
  }
  
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
  def format(format: js.Any, param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(format: Unit, param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatWithOptions(inspectOptions: InspectOptions, format: js.Any, param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithOptions")(inspectOptions.asInstanceOf[js.Any], format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatWithOptions(inspectOptions: InspectOptions, format: Unit, param: js.Any*): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatWithOptions")(inspectOptions.asInstanceOf[js.Any], format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getSystemErrorMap(): Map[Double, js.Tuple2[java.lang.String, java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemErrorMap")().asInstanceOf[Map[Double, js.Tuple2[java.lang.String, java.lang.String]]]
  
  @scala.inline
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object inspect {
    
    @scala.inline
    def apply(`object`: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, options: InspectOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Null, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Boolean, depth: Unit, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Unit, depth: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Unit, depth: Double, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Unit, depth: Null, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(`object`: js.Any, showHidden: Unit, depth: Unit, color: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @JSImport("util", "inspect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("util", "inspect.colors")
    @js.native
    def colors: Dict[js.Tuple2[Double, Double]] = js.native
    @scala.inline
    def colors_=(x: Dict[js.Tuple2[Double, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("util", "inspect.custom")
    @js.native
    val custom: js.Symbol = js.native
    
    @JSImport("util", "inspect.defaultOptions")
    @js.native
    def defaultOptions: InspectOptions = js.native
    @scala.inline
    def defaultOptions_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Allows changing inspect settings from the repl.
      */
    @JSImport("util", "inspect.replDefaults")
    @js.native
    def replDefaults: InspectOptions = js.native
    @scala.inline
    def replDefaults_=(x: InspectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replDefaults")(x.asInstanceOf[js.Any])
    
    /* Inlined {[ K in node.util.Style ]: string} */
    object styles {
      
      @JSImport("util", "inspect.styles")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("util", "inspect.styles.bigint")
      @js.native
      def bigint: java.lang.String = js.native
      @scala.inline
      def bigint_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigint")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.boolean")
      @js.native
      def boolean: java.lang.String = js.native
      @scala.inline
      def boolean_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.date")
      @js.native
      def date: java.lang.String = js.native
      @scala.inline
      def date_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.module")
      @js.native
      def module: java.lang.String = js.native
      @scala.inline
      def module_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.null")
      @js.native
      val `null`: java.lang.String = js.native
      
      @JSImport("util", "inspect.styles.number")
      @js.native
      def number: java.lang.String = js.native
      @scala.inline
      def number_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.regexp")
      @js.native
      def regexp: java.lang.String = js.native
      @scala.inline
      def regexp_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.special")
      @js.native
      def special: java.lang.String = js.native
      @scala.inline
      def special_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("special")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.string")
      @js.native
      def string: java.lang.String = js.native
      @scala.inline
      def string_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.symbol")
      @js.native
      def symbol: java.lang.String = js.native
      @scala.inline
      def symbol_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
      
      @JSImport("util", "inspect.styles.undefined")
      @js.native
      def undefined: java.lang.String = js.native
      @scala.inline
      def undefined_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  def isArray(`object`: js.Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
  
  @scala.inline
  def isBoolean(`object`: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  @scala.inline
  def isBuffer(`object`: js.Any): /* is node.buffer.<global>.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is node.buffer.<global>.Buffer */ Boolean]
  
  @scala.inline
  def isDate(`object`: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @scala.inline
  def isDeepStrictEqual(val1: js.Any, val2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeepStrictEqual")(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isError(`object`: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  @scala.inline
  def isFunction(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNull(`object`: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  @scala.inline
  def isNullOrUndefined(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNumber(`object`: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @scala.inline
  def isObject(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPrimitive(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  @scala.inline
  def isString(`object`: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def isSymbol(`object`: js.Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  @scala.inline
  def isUndefined(`object`: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
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
    
    @JSImport("util", "promisify")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("util", "promisify.custom")
    @js.native
    val custom: js.Symbol = js.native
  }
  
  type CustomInspectFunction = js.Function2[/* depth */ Double, /* options */ InspectOptionsStylized, java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.utilMod.CustomPromisifySymbol[TCustom]
    - tmttyped.node.utilMod.CustomPromisifyLegacy[TCustom]
  */
  trait CustomPromisify[TCustom /* <: js.Function */] extends StObject
  
  @js.native
  trait CustomPromisifyLegacy[TCustom /* <: js.Function */]
    extends js.Function
       with CustomPromisify[TCustom] {
    
    var __promisify__ : TCustom = js.native
  }
  
  @js.native
  trait CustomPromisifySymbol[TCustom /* <: js.Function */]
    extends js.Function
       with CustomPromisify[TCustom]
  
  trait EncodeIntoResult extends StObject {
    
    /**
      * The read Unicode code units of input.
      */
    var read: Double
    
    /**
      * The written UTF-8 bytes of output.
      */
    var written: Double
  }
  object EncodeIntoResult {
    
    @scala.inline
    def apply(read: Double, written: Double): EncodeIntoResult = {
      val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeIntoResult]
    }
    
    @scala.inline
    implicit class EncodeIntoResultMutableBuilder[Self <: EncodeIntoResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritten(value: Double): Self = StObject.set(x, "written", value.asInstanceOf[js.Any])
    }
  }
  
  trait InspectOptions extends StObject {
    
    var breakLength: js.UndefOr[Double] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to `false` causes each object key
      * to be displayed on a new line. It will also add new lines to text that is
      * longer than `breakLength`. If set to a number, the most `n` inner elements
      * are united on a single line as long as all properties fit into
      * `breakLength`. Short array elements are also grouped together. Note that no
      * text will be reduced below 16 characters, no matter the `breakLength` size.
      * For more information, see the example below.
      * @default `true`
      */
    var compact: js.UndefOr[Boolean | Double] = js.undefined
    
    var customInspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 2
      */
    var depth: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * If set to `true`, getters are going to be
      * inspected as well. If set to `'get'` only getters without setter are going
      * to be inspected. If set to `'set'` only getters having a corresponding
      * setter are going to be inspected. This might cause side effects depending on
      * the getter function.
      * @default `false`
      */
    var getters: js.UndefOr[get | set | Boolean] = js.undefined
    
    var maxArrayLength: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Specifies the maximum number of characters to
      * include when formatting. Set to `null` or `Infinity` to show all elements.
      * Set to `0` or negative to show no characters.
      * @default 10000
      */
    var maxStringLength: js.UndefOr[Double | Null] = js.undefined
    
    var showHidden: js.UndefOr[Boolean] = js.undefined
    
    var showProxy: js.UndefOr[Boolean] = js.undefined
    
    var sorted: js.UndefOr[
        Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, Double])
      ] = js.undefined
  }
  object InspectOptions {
    
    @scala.inline
    def apply(): InspectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectOptions]
    }
    
    @scala.inline
    implicit class InspectOptionsMutableBuilder[Self <: InspectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakLength(value: Double): Self = StObject.set(x, "breakLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakLengthUndefined: Self = StObject.set(x, "breakLength", js.undefined)
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean | Double): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthNull: Self = StObject.set(x, "depth", null)
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setGetters(value: get | set | Boolean): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      @scala.inline
      def setMaxArrayLength(value: Double): Self = StObject.set(x, "maxArrayLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxArrayLengthNull: Self = StObject.set(x, "maxArrayLength", null)
      
      @scala.inline
      def setMaxArrayLengthUndefined: Self = StObject.set(x, "maxArrayLength", js.undefined)
      
      @scala.inline
      def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStringLengthNull: Self = StObject.set(x, "maxStringLength", null)
      
      @scala.inline
      def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
      
      @scala.inline
      def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
      
      @scala.inline
      def setShowProxy(value: Boolean): Self = StObject.set(x, "showProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProxyUndefined: Self = StObject.set(x, "showProxy", js.undefined)
      
      @scala.inline
      def setSorted(value: Boolean | (js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, Double])): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedFunction2(value: (/* a */ java.lang.String, /* b */ java.lang.String) => Double): Self = StObject.set(x, "sorted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
  
  trait InspectOptionsStylized
    extends StObject
       with InspectOptions {
    
    def stylize(text: java.lang.String, styleType: Style): java.lang.String
  }
  object InspectOptionsStylized {
    
    @scala.inline
    def apply(stylize: (java.lang.String, Style) => java.lang.String): InspectOptionsStylized = {
      val __obj = js.Dynamic.literal(stylize = js.Any.fromFunction2(stylize))
      __obj.asInstanceOf[InspectOptionsStylized]
    }
    
    @scala.inline
    implicit class InspectOptionsStylizedMutableBuilder[Self <: InspectOptionsStylized] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStylize(value: (java.lang.String, Style) => java.lang.String): Self = StObject.set(x, "stylize", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.nodeStrings.special
    - tmttyped.node.nodeStrings.number
    - tmttyped.node.nodeStrings.bigint
    - tmttyped.node.nodeStrings.boolean
    - tmttyped.node.nodeStrings.undefined
    - tmttyped.node.nodeStrings.`null`
    - tmttyped.node.nodeStrings.string
    - tmttyped.node.nodeStrings.symbol
    - tmttyped.node.nodeStrings.date
    - tmttyped.node.nodeStrings.regexp
    - tmttyped.node.nodeStrings.module
  */
  trait Style extends StObject
  object Style {
    
    @scala.inline
    def bigint: tmttyped.node.nodeStrings.bigint = "bigint".asInstanceOf[tmttyped.node.nodeStrings.bigint]
    
    @scala.inline
    def boolean: tmttyped.node.nodeStrings.boolean = "boolean".asInstanceOf[tmttyped.node.nodeStrings.boolean]
    
    @scala.inline
    def date: tmttyped.node.nodeStrings.date = "date".asInstanceOf[tmttyped.node.nodeStrings.date]
    
    @scala.inline
    def module: tmttyped.node.nodeStrings.module = "module".asInstanceOf[tmttyped.node.nodeStrings.module]
    
    @scala.inline
    def `null`: tmttyped.node.nodeStrings.`null` = "null".asInstanceOf[tmttyped.node.nodeStrings.`null`]
    
    @scala.inline
    def number: tmttyped.node.nodeStrings.number = "number".asInstanceOf[tmttyped.node.nodeStrings.number]
    
    @scala.inline
    def regexp: tmttyped.node.nodeStrings.regexp = "regexp".asInstanceOf[tmttyped.node.nodeStrings.regexp]
    
    @scala.inline
    def special: tmttyped.node.nodeStrings.special = "special".asInstanceOf[tmttyped.node.nodeStrings.special]
    
    @scala.inline
    def string: tmttyped.node.nodeStrings.string = "string".asInstanceOf[tmttyped.node.nodeStrings.string]
    
    @scala.inline
    def symbol: tmttyped.node.nodeStrings.symbol = "symbol".asInstanceOf[tmttyped.node.nodeStrings.symbol]
    
    @scala.inline
    def undefined: tmttyped.node.nodeStrings.undefined = "undefined".asInstanceOf[tmttyped.node.nodeStrings.undefined]
  }
}
