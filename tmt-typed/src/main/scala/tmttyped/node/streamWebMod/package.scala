package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object streamWebMod {
  
  @scala.inline
  def ReadableStreamBYOBReader: scala.Any = tmttyped.node.streamWebMod.^.asInstanceOf[js.Dynamic].selectDynamic("ReadableStreamBYOBReader").asInstanceOf[scala.Any]
  
  @scala.inline
  def ReadableStreamBYOBRequest: scala.Any = tmttyped.node.streamWebMod.^.asInstanceOf[js.Dynamic].selectDynamic("ReadableStreamBYOBRequest").asInstanceOf[scala.Any]
  
  type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer
  
  type QueuingStrategySize[T] = js.Function1[/* chunk */ js.UndefOr[T], scala.Double]
  
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ tmttyped.node.streamWebMod.ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type ReadableStreamController[T] = tmttyped.node.streamWebMod.ReadableStreamDefaultController[T]
  
  type ReadableStreamErrorCallback = js.Function1[/* reason */ scala.Any, scala.Unit | js.Thenable[scala.Unit]]
  
  type TransformerFlushCallback[O] = js.Function1[
    /* controller */ tmttyped.node.streamWebMod.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TransformerStartCallback[O] = js.Function1[
    /* controller */ tmttyped.node.streamWebMod.TransformStreamDefaultController[O], 
    scala.Any
  ]
  
  type TransformerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ tmttyped.node.streamWebMod.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.UndefOr[scala.Any], scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSinkCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSinkStartCallback = js.Function1[
    /* controller */ tmttyped.node.streamWebMod.WritableStreamDefaultController, 
    scala.Any
  ]
  
  type UnderlyingSinkWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ tmttyped.node.streamWebMod.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.UndefOr[scala.Any], scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSourcePullCallback[R] = js.Function1[
    /* controller */ tmttyped.node.streamWebMod.ReadableStreamController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ tmttyped.node.streamWebMod.ReadableStreamController[R], scala.Any]
}
