package tmttyped.node

import tmttyped.node.streamWebMod.ByteLengthQueuingStrategy
import tmttyped.node.streamWebMod.CountQueuingStrategy
import tmttyped.node.streamWebMod.QueuingStrategy
import tmttyped.node.streamWebMod.QueuingStrategyInit
import tmttyped.node.streamWebMod.ReadableByteStreamController
import tmttyped.node.streamWebMod.ReadableStream
import tmttyped.node.streamWebMod.ReadableStreamDefaultController
import tmttyped.node.streamWebMod.ReadableStreamDefaultReader
import tmttyped.node.streamWebMod.TextDecoderOptions
import tmttyped.node.streamWebMod.TextDecoderStream
import tmttyped.node.streamWebMod.TextEncoderStream
import tmttyped.node.streamWebMod.TransformStream
import tmttyped.node.streamWebMod.TransformStreamDefaultController
import tmttyped.node.streamWebMod.Transformer
import tmttyped.node.streamWebMod.UnderlyingSink
import tmttyped.node.streamWebMod.UnderlyingSource
import tmttyped.node.streamWebMod.WritableStream
import tmttyped.node.streamWebMod.WritableStreamDefaultController
import tmttyped.node.streamWebMod.WritableStreamDefaultWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "ByteLengthQueuingStrategy")
  @js.native
  class ByteLengthQueuingStrategyCls protected ()
    extends StObject
       with ByteLengthQueuingStrategy {
    def this(init: QueuingStrategyInit) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "CountQueuingStrategy")
  @js.native
  class CountQueuingStrategyCls protected ()
    extends StObject
       with CountQueuingStrategy {
    def this(init: QueuingStrategyInit) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "ReadableByteStreamController")
  @js.native
  class ReadableByteStreamControllerCls ()
    extends StObject
       with ReadableByteStreamController
  
  @JSImport("node:stream/web", "ReadableStreamBYOBReader")
  @js.native
  val ReadableStreamBYOBReader: Any = js.native
  
  @JSImport("node:stream/web", "ReadableStreamBYOBRequest")
  @js.native
  val ReadableStreamBYOBRequest: Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "ReadableStream")
  @js.native
  class ReadableStreamCls[R] ()
    extends StObject
       with ReadableStream[R] {
    def this(underlyingSource: UnderlyingSource[R]) = this()
    def this(underlyingSource: Unit, strategy: QueuingStrategy[R]) = this()
    def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "ReadableStreamDefaultController")
  @js.native
  class ReadableStreamDefaultControllerCls ()
    extends StObject
       with ReadableStreamDefaultController[Any]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "ReadableStreamDefaultReader")
  @js.native
  class ReadableStreamDefaultReaderCls[R] protected ()
    extends StObject
       with ReadableStreamDefaultReader[R] {
    def this(stream: ReadableStream[R]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "TextDecoderStream")
  @js.native
  class TextDecoderStreamCls ()
    extends StObject
       with TextDecoderStream {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
    def this(label: Unit, options: TextDecoderOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "TextEncoderStream")
  @js.native
  class TextEncoderStreamCls ()
    extends StObject
       with TextEncoderStream
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "TransformStream")
  @js.native
  class TransformStreamCls[I, O] ()
    extends StObject
       with TransformStream[I, O] {
    def this(transformer: Transformer[I, O]) = this()
    def this(transformer: Unit, writableStrategy: QueuingStrategy[I]) = this()
    def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
    def this(transformer: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(transformer: Unit, writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
    def this(transformer: Transformer[I, O], writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
    def this(
      transformer: Transformer[I, O],
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    
    /* CompleteClass */
    override val readable: ReadableStream[O] = js.native
    
    /* CompleteClass */
    override val writable: WritableStream[I] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "TransformStreamDefaultController")
  @js.native
  class TransformStreamDefaultControllerCls ()
    extends StObject
       with TransformStreamDefaultController[Any]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "WritableStream")
  @js.native
  class WritableStreamCls[W] ()
    extends StObject
       with WritableStream[W] {
    def this(underlyingSink: UnderlyingSink[W]) = this()
    def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
    def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "WritableStreamDefaultController")
  @js.native
  class WritableStreamDefaultControllerCls ()
    extends StObject
       with WritableStreamDefaultController
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:stream/web", "WritableStreamDefaultWriter")
  @js.native
  class WritableStreamDefaultWriterCls[W] protected ()
    extends StObject
       with WritableStreamDefaultWriter[W] {
    def this(stream: WritableStream[W]) = this()
  }
}
