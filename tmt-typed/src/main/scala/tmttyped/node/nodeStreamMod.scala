package tmttyped.node

import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.NodeJS.ReadWriteStream
import tmttyped.node.NodeJS.ReadableStream
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.childProcessMod.StdioNull
import tmttyped.node.streamMod.DuplexOptions
import tmttyped.node.streamMod.FinishedOptions
import tmttyped.node.streamMod.ReadableOptions
import tmttyped.node.streamMod.TransformOptions
import tmttyped.node.streamMod.WritableOptions
import tmttyped.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeStreamMod {
  
  @JSImport("node:stream", JSImport.Namespace)
  @js.native
  class ^ ()
    extends tmttyped.node.streamMod.^
  @JSImport("node:stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Note: Duplex extends both Readable and Writable.
  @JSImport("node:stream", "Duplex")
  @js.native
  class Duplex ()
    extends tmttyped.node.streamMod.Duplex {
    def this(opts: DuplexOptions) = this()
  }
  
  @JSImport("node:stream", "PassThrough")
  @js.native
  class PassThrough ()
    extends tmttyped.node.streamMod.PassThrough {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("node:stream", "Readable")
  @js.native
  class Readable ()
    extends tmttyped.node.streamMod.Readable {
    def this(opts: ReadableOptions) = this()
  }
  object Readable {
    
    @JSImport("node:stream", "Readable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    @scala.inline
    def from(iterable: js.Iterable[_]): tmttyped.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.streamMod.Readable]
    @scala.inline
    def from(iterable: js.Iterable[_], options: ReadableOptions): tmttyped.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.streamMod.Readable]
    @scala.inline
    def from(iterable: AsyncIterable[_]): tmttyped.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.streamMod.Readable]
    @scala.inline
    def from(iterable: AsyncIterable[_], options: ReadableOptions): tmttyped.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.streamMod.Readable]
  }
  
  @JSImport("node:stream", "Stream")
  @js.native
  class Stream ()
    extends tmttyped.node.streamMod.Stream
       with StdioNull {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("node:stream", "Transform")
  @js.native
  class Transform ()
    extends tmttyped.node.streamMod.Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("node:stream", "Writable")
  @js.native
  class Writable ()
    extends tmttyped.node.streamMod.Writable {
    def this(opts: WritableOptions) = this()
  }
  
  @scala.inline
  def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(
    stream: ReadWriteStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(
    stream: ReadableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def finished(
    stream: WritableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  @scala.inline
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], stream3.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], stream3.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], stream3.asInstanceOf[js.Any], stream4.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], stream3.asInstanceOf[js.Any], stream4.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], stream3.asInstanceOf[js.Any], stream4.asInstanceOf[js.Any], stream5.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], stream3.asInstanceOf[js.Any], stream4.asInstanceOf[js.Any], stream5.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
}
