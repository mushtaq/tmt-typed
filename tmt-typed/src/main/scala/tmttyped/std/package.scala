package tmttyped

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object std {
  
  type AlgorithmIdentifier = java.lang.String | org.scalajs.dom.crypto.Algorithm
  
  type ArrayBufferLike = tmttyped.std.SharedArrayBuffer | js.typedarray.ArrayBuffer
  
  type AudioWorklet = tmttyped.std.Worklet
  
  type AutoKeyword = tmttyped.std.stdStrings.auto
  
  type BigInteger = js.typedarray.Uint8Array
  
  type BlobCallback = js.Function1[/* blob */ org.scalajs.dom.raw.Blob | scala.Null, scala.Unit]
  
  type BlobPart = tmttyped.std.BufferSource | org.scalajs.dom.raw.Blob | java.lang.String
  
  type BodyInit = org.scalajs.dom.raw.Blob | tmttyped.std.BufferSource | org.scalajs.dom.raw.FormData | tmttyped.std.URLSearchParams | org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array] | java.lang.String
  
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer
  
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = org.scalajs.dom.raw.Text
  
  type COSEAlgorithmIdentifier = scala.Double
  
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = tmttyped.std.CSSConditionRule
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.HTMLOrSVGImageElement
    - tmttyped.std.HTMLVideoElement
    - tmttyped.std.HTMLCanvasElement
    - tmttyped.std.ImageBitmap
    - tmttyped.std.OffscreenCanvas
  */
  type CanvasImageSource = tmttyped.std._CanvasImageSource | tmttyped.std.HTMLOrSVGImageElement | org.scalajs.dom.raw.HTMLVideoElement | org.scalajs.dom.raw.HTMLCanvasElement
  
  /**
    * Convert first character of string literal type to uppercase
    */
  type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = org.scalajs.dom.raw.AudioNode
  
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = org.scalajs.dom.raw.AudioNode
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = org.scalajs.dom.raw.CharacterData
  
  type ConstrainBoolean = scala.Boolean | tmttyped.std.ConstrainBooleanParameters
  
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | tmttyped.std.ConstrainDOMStringParameters
  
  type ConstrainDouble = scala.Double | tmttyped.std.ConstrainDoubleRange
  
  type ConstrainULong = scala.Double | tmttyped.std.ConstrainULongRange
  
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  
  type DOMHighResTimeStamp = scala.Double
  
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type DOMTimeStamp = scala.Double
  
  type DecodeErrorCallback = js.Function1[/* error */ org.scalajs.dom.raw.DOMException, scala.Unit]
  
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalajs.dom.raw.AudioBuffer, scala.Unit]
  
  type DocumentTimeline = tmttyped.std.AnimationTimeline
  
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = tmttyped.std.HTMLElementTagNameMap with (tmttyped.std.Pick[
    tmttyped.std.SVGElementTagNameMap, 
    tmttyped.std.Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ])
  
  type EvalError = js.Error
  
  type EventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.raw.Event, js.Any]
  
  type EventListener = js.Function1[/* evt */ org.scalajs.dom.raw.Event, scala.Unit]
  
  type EventListenerOrEventListenerObject = tmttyped.std.EventListener | tmttyped.std.EventListenerObject
  
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  
  type FlatArray[Arr, Depth /* <: scala.Double */] = /* import warning: importer.ImportType#apply Failed type conversion: std.anon.Done<Arr>[Depth extends -1 ? 'done' : 'recur'] */ js.Any
  
  type Float32List = js.typedarray.Float32Array | js.Array[tmttyped.std.GLfloat]
  
  type ForEachCallback = js.Function2[
    /* keyId */ js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | scala.Null, 
    /* status */ tmttyped.std.MediaKeyStatus, 
    scala.Unit
  ]
  
  type FormDataEntryValue = org.scalajs.dom.raw.File | java.lang.String
  
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  
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
  
  type HTMLOrSVGImageElement = org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.SVGImageElement
  
  type HTMLOrSVGScriptElement = org.scalajs.dom.raw.HTMLScriptElement | org.scalajs.dom.raw.SVGScriptElement
  
  type HashAlgorithmIdentifier = tmttyped.std.AlgorithmIdentifier
  
  type HeadersInit = org.scalajs.dom.experimental.Headers | js.Array[js.Array[java.lang.String]] | (tmttyped.std.Record[java.lang.String, java.lang.String])
  
  type IDBKeyPath = java.lang.String
  
  type IDBValidKey = scala.Double | java.lang.String | js.Date | tmttyped.std.BufferSource | tmttyped.std.IDBArrayKey
  
  type ImageBitmapSource = tmttyped.std.CanvasImageSource | org.scalajs.dom.raw.Blob | org.scalajs.dom.raw.ImageData
  
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  
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
  type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  type MSCredentialType = tmttyped.std.stdStrings.FIDO_2_0
  
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  
  type MediaProvider = org.scalajs.dom.experimental.mediastream.MediaStream | tmttyped.std.MediaSource | org.scalajs.dom.raw.Blob
  
  type MediaStreamTrackAudioSourceNode = org.scalajs.dom.raw.AudioNode
  
  type MessageEventSource = org.scalajs.dom.raw.Window | org.scalajs.dom.raw.MessagePort | org.scalajs.dom.experimental.serviceworkers.ServiceWorker
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ tmttyped.std.TypedPropertyDescriptor[js.Any], 
    tmttyped.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  
  /** @deprecated */
  type MouseWheelEvent = org.scalajs.dom.raw.WheelEvent
  
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalajs.dom.raw.MutationRecord], 
    /* observer */ org.scalajs.dom.raw.MutationObserver, 
    scala.Unit
  ]
  
  type NamedCurve = java.lang.String
  
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ tmttyped.std.MediaStreamError, scala.Unit]
  
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ org.scalajs.dom.experimental.mediastream.MediaStream, scala.Unit]
  
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  
  type NotificationPermissionCallback = js.Function1[/* permission */ tmttyped.std.NotificationPermission, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.OffscreenCanvasRenderingContext2D
    - tmttyped.std.ImageBitmapRenderingContext
    - tmttyped.std.WebGLRenderingContext
    - tmttyped.std.WebGL2RenderingContext
  */
  type OffscreenRenderingContext = tmttyped.std._OffscreenRenderingContext | org.scalajs.dom.raw.WebGLRenderingContext
  
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = tmttyped.std.Pick[T, tmttyped.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  
  type OnBeforeUnloadEventHandler = tmttyped.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.raw.Event, java.lang.String | scala.Null]
  
  type OnErrorEventHandler = tmttyped.std.OnErrorEventHandlerNonNull | scala.Null
  
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ org.scalajs.dom.raw.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Error], 
    js.Any
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
  type Parameters[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ tmttyped.std.stdStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type PaymentRequestUpdateEventInit = tmttyped.std.EventInit
  
  type PerformanceEntryList = js.Array[org.scalajs.dom.raw.PerformanceEntry]
  
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = org.scalajs.dom.raw.PerformanceEntry
  
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = org.scalajs.dom.raw.PerformanceEntry
  
  type PerformanceObserverCallback = js.Function2[
    /* entries */ tmttyped.std.PerformanceObserverEntryList, 
    /* observer */ tmttyped.std.PerformanceObserver, 
    scala.Unit
  ]
  
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
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[js.PropertyDescriptor]
  
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  
  type PublicKeyCredentialType = tmttyped.std.stdStrings.`public-key`
  
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  
  type RTCAnswerOptions = tmttyped.std.RTCOfferAnswerOptions
  
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalajs.dom.raw.DOMException, scala.Unit]
  
  type RTCRtpDecodingParameters = tmttyped.std.RTCRtpCodingParameters
  
  type RTCSessionDescriptionCallback = js.Function1[
    /* description */ org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit, 
    scala.Unit
  ]
  
  type RTCStatsCallback = js.Function1[/* report */ org.scalajs.dom.experimental.webrtc.RTCStatsReport, scala.Unit]
  
  type RangeError = js.Error
  
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ tmttyped.std.ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ tmttyped.std.ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  
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
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.CanvasRenderingContext2D
    - tmttyped.std.ImageBitmapRenderingContext
    - tmttyped.std.WebGLRenderingContext
    - tmttyped.std.WebGL2RenderingContext
  */
  type RenderingContext = tmttyped.std._RenderingContext | org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.WebGLRenderingContext
  
  type RequestInfo = org.scalajs.dom.experimental.Request | java.lang.String
  
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ tmttyped.std.stdStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  
  type SVGMatrix = tmttyped.std.DOMMatrix
  
  type SVGPathSegClosePath = org.scalajs.dom.raw.SVGPathSeg
  
  type SVGPoint = tmttyped.std.DOMPoint
  
  type SVGRect = tmttyped.std.DOMRect
  
  type ScopedCredentialType = tmttyped.std.stdStrings.ScopedCred
  
  type StaticRange = tmttyped.std.AbstractRange
  
  type SyntaxError = js.Error
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.ImageBitmap
    - tmttyped.std.ImageData
    - tmttyped.std.HTMLImageElement
    - tmttyped.std.HTMLCanvasElement
    - tmttyped.std.HTMLVideoElement
    - tmttyped.std.OffscreenCanvas
  */
  type TexImageSource = tmttyped.std._TexImageSource | org.scalajs.dom.raw.ImageData | org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLCanvasElement | org.scalajs.dom.raw.HTMLVideoElement
  
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  
  type TimerHandler = java.lang.String | js.Function
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.std.ArrayBuffer
    - tmttyped.std.MessagePort
    - tmttyped.std.ImageBitmap
    - tmttyped.std.OffscreenCanvas
  */
  type Transferable = tmttyped.std._Transferable | js.typedarray.ArrayBuffer | org.scalajs.dom.raw.MessagePort
  
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ tmttyped.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
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
  type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  /**
    * Convert string literal type to uppercase
    */
  type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  type UvmEntries = js.Array[tmttyped.std.UvmEntry]
  
  type UvmEntry = js.Array[scala.Double]
  
  type VibratePattern = scala.Double | js.Array[scala.Double]
  
  type VoidFunction = js.Function0[scala.Unit]
  
  /** Part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
  type WebGLBuffer = tmttyped.std.WebGLObject
  
  /** Part of the WebGL API and represents a collection of buffers that serve as a rendering destination. */
  type WebGLFramebuffer = tmttyped.std.WebGLObject
  
  /** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
  type WebGLProgram = tmttyped.std.WebGLObject
  
  type WebGLQuery = tmttyped.std.WebGLObject
  
  /** Part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation. */
  type WebGLRenderbuffer = tmttyped.std.WebGLObject
  
  type WebGLSampler = tmttyped.std.WebGLObject
  
  /** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
  type WebGLShader = tmttyped.std.WebGLObject
  
  type WebGLSync = tmttyped.std.WebGLObject
  
  /** Part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
  type WebGLTexture = tmttyped.std.WebGLObject
  
  type WebGLTransformFeedback = tmttyped.std.WebGLObject
  
  type WebGLVertexArrayObject = tmttyped.std.WebGLObject
  
  type WebGLVertexArrayObjectOES = tmttyped.std.WebGLObject
  
  type WebKitCSSMatrix = tmttyped.std.DOMMatrix
  
  type WindowProxy = org.scalajs.dom.raw.Window
  
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ tmttyped.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ tmttyped.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = tmttyped.std.XPathEvaluatorBase
  
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | scala.Null, java.lang.String | scala.Null]) | tmttyped.std.anon.LookupNamespaceURI
  
  type webkitURL = org.scalajs.dom.experimental.URL
}
