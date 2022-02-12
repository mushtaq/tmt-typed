package tmttyped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object std {
  
  type AlgorithmIdentifier = org.scalajs.dom.Algorithm | java.lang.String
  
  type ArrayBufferLike = tmttyped.std.SharedArrayBuffer | js.typedarray.ArrayBuffer
  
  /** Available only in secure contexts. */
  type AudioWorklet = tmttyped.std.Worklet
  
  type AutoKeyword = tmttyped.std.stdStrings.auto
  
  /**
    * Recursively unwraps the "awaited type" of a type. Non-promise "thenables" should resolve to `never`. This emulates the behavior of `await`.
    */
  type Awaited[T] = (// the argument to `then` was not callable
  T) | scala.Any
  
  type BigInteger = js.typedarray.Uint8Array
  
  type BinaryData = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  type BlobCallback = js.Function1[/* blob */ org.scalajs.dom.Blob | scala.Null, scala.Unit]
  
  type BlobPart = tmttyped.std.BufferSource | org.scalajs.dom.Blob | java.lang.String
  
  type BodyInit = org.scalajs.dom.ReadableStream[scala.Any] | tmttyped.std.XMLHttpRequestBodyInit
  
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer
  
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = org.scalajs.dom.Text
  
  type COSEAlgorithmIdentifier = scala.Double
  
  type CSSNumberish = scala.Double
  
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = tmttyped.std.CSSConditionRule
  
  type CanvasImageSource = tmttyped.std.HTMLOrSVGImageElement | org.scalajs.dom.HTMLVideoElement | org.scalajs.dom.HTMLCanvasElement | tmttyped.std.ImageBitmap
  
  /**
    * Convert first character of string literal type to uppercase
    */
  type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = org.scalajs.dom.AudioNode
  
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = org.scalajs.dom.AudioNode
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  
  /** @deprecated */
  type ClientRect = org.scalajs.dom.DOMRect
  
  type ClipboardItemData = js.Promise[tmttyped.std.ClipboardItemDataType]
  
  type ClipboardItemDataType = java.lang.String | org.scalajs.dom.Blob
  
  type ClipboardItems = js.Array[tmttyped.std.ClipboardItem]
  
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = org.scalajs.dom.CharacterData
  
  type ConstrainBoolean = scala.Boolean | tmttyped.std.ConstrainBooleanParameters
  
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | tmttyped.std.ConstrainDOMStringParameters
  
  type ConstrainDouble = scala.Double | tmttyped.std.ConstrainDoubleRange
  
  type ConstrainULong = scala.Double | tmttyped.std.ConstrainULongRange
  
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ scala.Any, scala.Any] */] = scala.Any
  
  type DOMHighResTimeStamp = scala.Double
  
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = /* standard DOM */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type DOMTimeStamp = scala.Double
  
  type DecodeErrorCallback = js.Function1[/* error */ org.scalajs.dom.DOMException, scala.Unit]
  
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalajs.dom.AudioBuffer, scala.Unit]
  
  type DocumentTimeline = tmttyped.std.AnimationTimeline
  
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = tmttyped.std.HTMLElementTagNameMap with (tmttyped.std.Pick[
    tmttyped.std.SVGElementTagNameMap, 
    tmttyped.std.Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ scala.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ scala.Any
    ]
  ])
  
  type ErrorCallback = js.Function1[/* err */ org.scalajs.dom.DOMException, scala.Unit]
  
  type EvalError = js.Error
  
  type EventListener = js.Function1[/* evt */ org.scalajs.dom.Event, scala.Unit]
  
  type EventListenerOrEventListenerObject = tmttyped.std.EventListener | tmttyped.std.EventListenerObject
  
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  
  type FileCallback = js.Function1[/* file */ org.scalajs.dom.File, scala.Unit]
  
  type FileSystemEntriesCallback = js.Function1[/* entries */ js.Array[tmttyped.std.FileSystemEntry], scala.Unit]
  
  type FileSystemEntryCallback = js.Function1[/* entry */ tmttyped.std.FileSystemEntry, scala.Unit]
  
  type FlatArray[Arr, Depth /* <: scala.Double */] = /* import warning: importer.ImportType#apply Failed type conversion: std.anon.Done<Arr>[Depth extends -1 ? 'done' : 'recur'] */ js.Any
  
  type Float32List = js.typedarray.Float32Array | js.Array[tmttyped.std.GLfloat]
  
  type FormDataEntryValue = org.scalajs.dom.File | java.lang.String
  
  type FrameRequestCallback = js.Function1[/* time */ tmttyped.std.DOMHighResTimeStamp, scala.Unit]
  
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  
  type GLbitfield = scala.Double
  
  type GLboolean = scala.Boolean
  
  type GLclampf = scala.Double
  
  type GLenum = scala.Double
  
  type GLfloat = scala.Double
  
  type GLint = scala.Double
  
  type GLint64 = scala.Double
  
  type GLintptr = scala.Double
  
  type GLsizei = scala.Double
  
  type GLsizeiptr = scala.Double
  
  type GLuint = scala.Double
  
  type GLuint64 = scala.Double
  
  type GamepadHapticActuatorType = tmttyped.std.stdStrings.vibration
  
  type HTMLOrSVGImageElement = org.scalajs.dom.HTMLImageElement | org.scalajs.dom.SVGImageElement
  
  type HTMLOrSVGScriptElement = org.scalajs.dom.HTMLScriptElement | org.scalajs.dom.SVGScriptElement
  
  type HashAlgorithmIdentifier = tmttyped.std.AlgorithmIdentifier
  
  type HeadersInit = js.Array[js.Array[java.lang.String]] | (tmttyped.std.Record[java.lang.String, java.lang.String]) | org.scalajs.dom.Headers
  
  type IDBValidKey = scala.Double | java.lang.String | js.Date | tmttyped.std.BufferSource | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias std.IDBValidKey */ js.Object
  ])
  
  type IdleRequestCallback = js.Function1[/* deadline */ tmttyped.std.IdleDeadline, scala.Unit]
  
  type ImageBitmapSource = tmttyped.std.CanvasImageSource | org.scalajs.dom.Blob | org.scalajs.dom.ImageData
  
  /**
    * The type for the `assert` property of the optional second argument to `import()`.
    */
  type ImportAssertions = /* standard es5 */
  org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ scala.Any, scala.Any] */] = scala.Any
  
  type Int32List = js.typedarray.Int32Array | js.Array[tmttyped.std.GLint]
  
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[tmttyped.std.IntersectionObserverEntry], 
    /* observer */ tmttyped.std.IntersectionObserver, 
    scala.Unit
  ]
  
  type LineAndPositionSetting = scala.Double | tmttyped.std.AutoKeyword
  
  /**
    * Convert string literal type to lowercase
    */
  type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  type MediaProvider = org.scalajs.dom.MediaStream | tmttyped.std.MediaSource | org.scalajs.dom.Blob
  
  type MediaSessionActionHandler = js.Function1[/* details */ tmttyped.std.MediaSessionActionDetails, scala.Unit]
  
  type MessageEventSource = org.scalajs.dom.Window | org.scalajs.dom.MessagePort | org.scalajs.dom.ServiceWorker
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ tmttyped.std.TypedPropertyDescriptor[scala.Any], 
    tmttyped.std.TypedPropertyDescriptor[scala.Any] | scala.Unit
  ]
  
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalajs.dom.MutationRecord], 
    /* observer */ org.scalajs.dom.MutationObserver, 
    scala.Unit
  ]
  
  type NamedCurve = java.lang.String
  
  type NodeFilter = (js.Function1[/* node */ org.scalajs.dom.Node, scala.Double]) | tmttyped.std.anon.AcceptNode
  
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  
  type NotificationPermissionCallback = js.Function1[/* permission */ tmttyped.std.NotificationPermission, scala.Unit]
  
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = tmttyped.std.Pick[T, tmttyped.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ scala.Any, scala.Any])
  
  type OnBeforeUnloadEventHandler = tmttyped.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.Event, java.lang.String | scala.Null]
  
  type OnErrorEventHandler = tmttyped.std.OnErrorEventHandlerNonNull | scala.Null
  
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ org.scalajs.dom.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Error], 
    scala.Any
  ]
  
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* args */ scala.Any, scala.Any] */] = scala.Any
  
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ tmttyped.std.stdStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type PaymentRequestUpdateEventInit = tmttyped.std.EventInit
  
  type PerformanceEntryList = js.Array[org.scalajs.dom.PerformanceEntry]
  
  type PerformanceObserverCallback = js.Function2[
    /* entries */ tmttyped.std.PerformanceObserverEntryList, 
    /* observer */ tmttyped.std.PerformanceObserver, 
    scala.Unit
  ]
  
  type PerformancePaintTiming = org.scalajs.dom.PerformanceEntry
  
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ tmttyped.std.stdStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  
  type PositionCallback = js.Function1[/* position */ tmttyped.std.GeolocationPosition, scala.Unit]
  
  type PositionErrorCallback = js.Function1[/* positionError */ tmttyped.std.GeolocationPositionError, scala.Unit]
  
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.Object | js.Thenable[js.Object], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[scala.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  
  type PropertyDescriptorMap = /* standard es5 */
  org.scalablytyped.runtime.StringDictionary[js.PropertyDescriptor]
  
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  
  type PublicKeyCredentialType = tmttyped.std.stdStrings.`public-key`
  
  type QueuingStrategySize[T] = js.Function1[/* chunk */ T, scala.Double]
  
  type RTCAnswerOptions = tmttyped.std.RTCOfferAnswerOptions
  
  type RTCIceCredentialType = tmttyped.std.stdStrings.password
  
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalajs.dom.DOMException, scala.Unit]
  
  type RTCRtcpMuxPolicy = tmttyped.std.stdStrings.require
  
  type RTCRtpReceiveParameters = tmttyped.std.RTCRtpParameters
  
  type RTCRtpSynchronizationSource = tmttyped.std.RTCRtpContributingSource
  
  type RTCSessionDescriptionCallback = js.Function1[/* description */ org.scalajs.dom.RTCSessionDescriptionInit, scala.Unit]
  
  type RangeError = js.Error
  
  type ReadableStreamController[T] = tmttyped.std.ReadableStreamDefaultController[T]
  
  type ReadableStreamReader[T] = tmttyped.std.ReadableStreamDefaultReader[T]
  
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ tmttyped.std.stdStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: /* keyof any */ java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ReferenceError = js.Error
  
  type RemotePlaybackAvailabilityCallback = js.Function1[/* available */ scala.Boolean, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - org.scalajs.dom.CanvasRenderingContext2D
    - tmttyped.std.ImageBitmapRenderingContext
    - org.scalajs.dom.WebGLRenderingContext
    - tmttyped.std.WebGL2RenderingContext
  */
  type RenderingContext = tmttyped.std._RenderingContext | org.scalajs.dom.CanvasRenderingContext2D | org.scalajs.dom.WebGLRenderingContext
  
  type RequestInfo = org.scalajs.dom.Request | java.lang.String
  
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ tmttyped.std.stdStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[tmttyped.std.ResizeObserverEntry], 
    /* observer */ tmttyped.std.ResizeObserver, 
    scala.Unit
  ]
  
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ scala.Any, scala.Any] */] = scala.Any
  
  type SVGMatrix = tmttyped.std.DOMMatrix
  
  type SVGPoint = tmttyped.std.DOMPoint
  
  type SVGRect = org.scalajs.dom.DOMRect
  
  type StaticRange = tmttyped.std.AbstractRange
  
  type SyntaxError = js.Error
  
  type TexImageSource = tmttyped.std.ImageBitmap | org.scalajs.dom.ImageData | org.scalajs.dom.HTMLImageElement | org.scalajs.dom.HTMLCanvasElement | org.scalajs.dom.HTMLVideoElement
  
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = scala.Any
  
  type TimerHandler = java.lang.String | js.Function
  
  type Transferable = js.typedarray.ArrayBuffer | org.scalajs.dom.MessagePort | tmttyped.std.ImageBitmap
  
  type TransformerFlushCallback[O] = js.Function1[
    /* controller */ tmttyped.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TransformerStartCallback[O] = js.Function1[/* controller */ tmttyped.std.TransformStreamDefaultController[O], scala.Any]
  
  type TransformerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ tmttyped.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TypeError = js.Error
  
  type URIError = js.Error
  
  type Uint32List = js.typedarray.Uint32Array | js.Array[tmttyped.std.GLuint]
  
  /**
    * Convert first character of string literal type to lowercase
    */
  type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.UndefOr[scala.Any], scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSinkCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSinkStartCallback = js.Function1[/* controller */ tmttyped.std.WritableStreamDefaultController, scala.Any]
  
  type UnderlyingSinkWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ tmttyped.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.UndefOr[scala.Any], scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSourcePullCallback[R] = js.Function1[
    /* controller */ tmttyped.std.ReadableStreamController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ tmttyped.std.ReadableStreamController[R], scala.Any]
  
  /**
    * Convert string literal type to uppercase
    */
  type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ scala.Any
  
  type UvmEntries = js.Array[tmttyped.std.UvmEntry]
  
  type UvmEntry = js.Array[scala.Double]
  
  type VibratePattern = scala.Double | js.Array[scala.Double]
  
  type VoidFunction = js.Function0[scala.Unit]
  
  type WebKitCSSMatrix = tmttyped.std.DOMMatrix
  
  type WindowProxy = org.scalajs.dom.Window
  
  type XMLHttpRequestBodyInit = org.scalajs.dom.Blob | tmttyped.std.BufferSource | org.scalajs.dom.FormData | tmttyped.std.URLSearchParams | java.lang.String
  
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = tmttyped.std.XPathEvaluatorBase
  
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | scala.Null, java.lang.String | scala.Null]) | tmttyped.std.anon.LookupNamespaceURI
  
  type webkitURL = org.scalajs.dom.URL
}
