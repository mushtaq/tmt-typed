package tmttyped.node

import tmttyped.node.NodeJS.ErrnoException
import tmttyped.node.NodeJS.ReadWriteStream
import tmttyped.node.NodeJS.ReadableStream
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.childProcessMod.StdioNull
import tmttyped.node.streamMod.DuplexOptions
import tmttyped.node.streamMod.FinishedOptions
import tmttyped.node.streamMod.PipelineCallback
import tmttyped.node.streamMod.PipelineDestination
import tmttyped.node.streamMod.PipelineOptions
import tmttyped.node.streamMod.PipelinePromise
import tmttyped.node.streamMod.PipelineSource
import tmttyped.node.streamMod.PipelineTransform
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
  class ^ () extends StObject
  @JSImport("node:stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplex streams are streams that implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Duplex` streams include:
    *
    * * `TCP sockets`
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("node:stream", "Duplex")
  @js.native
  class Duplex () extends StObject {
    def this(opts: DuplexOptions) = this()
  }
  
  /**
    * The `stream.PassThrough` class is a trivial implementation of a `Transform` stream that simply passes the input bytes across to the output. Its purpose is
    * primarily for examples and testing, but there are some use cases where`stream.PassThrough` is useful as a building block for novel sorts of streams.
    */
  @JSImport("node:stream", "PassThrough")
  @js.native
  class PassThrough () extends StObject {
    def this(opts: TransformOptions) = this()
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("node:stream", "Readable")
  @js.native
  class Readable () extends StObject {
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
    def from(iterable: js.Iterable[js.Any]): tmttyped.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.streamMod.Readable]
    @scala.inline
    def from(iterable: js.Iterable[js.Any], options: ReadableOptions): tmttyped.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.streamMod.Readable]
    @scala.inline
    def from(iterable: AsyncIterable[js.Any]): tmttyped.node.streamMod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.streamMod.Readable]
    @scala.inline
    def from(iterable: AsyncIterable[js.Any], options: ReadableOptions): tmttyped.node.streamMod.Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.streamMod.Readable]
  }
  
  @JSImport("node:stream", "Stream")
  @js.native
  class Stream ()
    extends StObject
       with StdioNull {
    def this(opts: ReadableOptions) = this()
  }
  
  /**
    * Transform streams are `Duplex` streams where the output is in some way
    * related to the input. Like all `Duplex` streams, `Transform` streams
    * implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Transform` streams include:
    *
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("node:stream", "Transform")
  @js.native
  class Transform () extends StObject {
    def this(opts: TransformOptions) = this()
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("node:stream", "Writable")
  @js.native
  class Writable () extends StObject {
    def this(opts: WritableOptions) = this()
  }
  
  /**
    * Attaches an AbortSignal to a readable or writeable stream. This lets code
    * control stream destruction using an `AbortController`.
    *
    * Calling `abort` on the `AbortController` corresponding to the passed`AbortSignal` will behave the same way as calling `.destroy(new AbortError())`on the stream.
    *
    * ```js
    * const fs = require('fs');
    *
    * const controller = new AbortController();
    * const read = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json'))
    * );
    * // Later, abort the operation closing the stream
    * controller.abort();
    * ```
    *
    * Or using an `AbortSignal` with a readable stream as an async iterable:
    *
    * ```js
    * const controller = new AbortController();
    * setTimeout(() => controller.abort(), 10_000); // set a timeout
    * const stream = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json'))
    * );
    * (async () => {
    *   try {
    *     for await (const chunk of stream) {
    *       await process(chunk);
    *     }
    *   } catch (e) {
    *     if (e.name === 'AbortError') {
    *       // The operation was cancelled
    *     } else {
    *       throw e;
    *     }
    *   }
    * })();
    * ```
    * @since v15.4.0
    * @param signal A signal representing possible cancellation
    * @param stream a stream to attach a signal to
    */
  @scala.inline
  def addAbortSignal[T /* <: tmttyped.node.streamMod.Stream */](signal: AbortSignal, stream: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addAbortSignal")(signal.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  /**
    * A function to get notified when a stream is no longer readable, writable
    * or has experienced an error or a premature close event.
    *
    * ```js
    * const { finished } = require('stream');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * finished(rs, (err) => {
    *   if (err) {
    *     console.error('Stream failed.', err);
    *   } else {
    *     console.log('Stream is done reading.');
    *   }
    * });
    *
    * rs.resume(); // Drain the stream.
    * ```
    *
    * Especially useful in error handling scenarios where a stream is destroyed
    * prematurely (like an aborted HTTP request), and will not emit `'end'`or `'finish'`.
    *
    * The `finished` API provides promise version:
    *
    * ```js
    * const { finished } = require('stream/promises');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * async function run() {
    *   await finished(rs);
    *   console.log('Stream is done reading.');
    * }
    *
    * run().catch(console.error);
    * rs.resume(); // Drain the stream.
    * ```
    *
    * `stream.finished()` leaves dangling event listeners (in particular`'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
    * invoked. The reason for this is so that unexpected `'error'` events (due to
    * incorrect stream implementations) do not cause unexpected crashes.
    * If this is unwanted behavior then the returned cleanup function needs to be
    * invoked in the callback:
    *
    * ```js
    * const cleanup = finished(rs, (err) => {
    *   cleanup();
    *   // ...
    * });
    * ```
    * @since v10.0.0
    * @param stream A readable and/or writable stream.
    * @param callback A callback function that takes an optional error argument.
    * @return A cleanup function which removes all registered listeners.
    */
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
  /**
    * A module method to pipe between streams and generators forwarding errors and
    * properly cleaning up and provide a callback when the pipeline is complete.
    *
    * ```js
    * const { pipeline } = require('stream');
    * const fs = require('fs');
    * const zlib = require('zlib');
    *
    * // Use the pipeline API to easily pipe a series of streams
    * // together and get notified when the pipeline is fully done.
    *
    * // A pipeline to gzip a potentially huge tar file efficiently:
    *
    * pipeline(
    *   fs.createReadStream('archive.tar'),
    *   zlib.createGzip(),
    *   fs.createWriteStream('archive.tar.gz'),
    *   (err) => {
    *     if (err) {
    *       console.error('Pipeline failed.', err);
    *     } else {
    *       console.log('Pipeline succeeded.');
    *     }
    *   }
    * );
    * ```
    *
    * The `pipeline` API provides a promise version, which can also
    * receive an options argument as the last parameter with a`signal` `<AbortSignal>` property. When the signal is aborted,`destroy` will be called on the underlying pipeline, with
    * an`AbortError`.
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    *
    * async function run() {
    *   await pipeline(
    *     fs.createReadStream('archive.tar'),
    *     zlib.createGzip(),
    *     fs.createWriteStream('archive.tar.gz')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * To use an `AbortSignal`, pass it inside an options object,
    * as the last argument:
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    *
    * async function run() {
    *   const ac = new AbortController();
    *   const options = {
    *     signal: ac.signal,
    *   };
    *
    *   setTimeout(() => ac.abort(), 1);
    *   await pipeline(
    *     fs.createReadStream('archive.tar'),
    *     zlib.createGzip(),
    *     fs.createWriteStream('archive.tar.gz'),
    *     options,
    *   );
    * }
    *
    * run().catch(console.error); // AbortError
    * ```
    *
    * The `pipeline` API also supports async generators:
    *
    * ```js
    * const { pipeline } = require('stream/promises');
    * const fs = require('fs');
    *
    * async function run() {
    *   await pipeline(
    *     fs.createReadStream('lowercase.txt'),
    *     async function* (source) {
    *       source.setEncoding('utf8');  // Work with strings rather than `Buffer`s.
    *       for await (const chunk of source) {
    *         yield chunk.toUpperCase();
    *       }
    *     },
    *     fs.createWriteStream('uppercase.txt')
    *   );
    *   console.log('Pipeline succeeded.');
    * }
    *
    * run().catch(console.error);
    * ```
    *
    * `stream.pipeline()` will call `stream.destroy(err)` on all streams except:
    *
    * * `Readable` streams which have emitted `'end'` or `'close'`.
    * * `Writable` streams which have emitted `'finish'` or `'close'`.
    *
    * `stream.pipeline()` leaves dangling event listeners on the streams
    * after the `callback` has been invoked. In the case of reuse of streams after
    * failure, this can cause event listener leaks and swallowed errors.
    * @since v10.0.0
    * @param callback Called when the pipeline is fully done.
    */
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B, callback: PipelineCallback[B]): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B, callback: PipelineCallback[B]): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B, callback: PipelineCallback[B]): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    callback: PipelineCallback[B]
  ): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  @scala.inline
  def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    callback: PipelineCallback[B]
  ): WritableStream | B = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream | B]
  
  object promises {
    
    @JSImport("node:stream", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def finished(stream: ReadWriteStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def finished(stream: ReadWriteStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def finished(stream: ReadableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def finished(stream: ReadableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def finished(stream: WritableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def finished(stream: WritableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def pipeline(
      stream1: ReadableStream,
      stream2: ReadWriteStream,
      streams: (ReadWriteStream | WritableStream | PipelineOptions)*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def pipeline(
      stream1: ReadableStream,
      stream2: WritableStream,
      streams: (ReadWriteStream | WritableStream | PipelineOptions)*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream], options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, B /* <: PipelineDestination[A, js.Any] */](source: A, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, B /* <: PipelineDestination[T1, js.Any] */](source: A, transform1: T1, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, B /* <: PipelineDestination[T2, js.Any] */](source: A, transform1: T1, transform2: T2, destination: B, options: PipelineOptions): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, B /* <: PipelineDestination[T3, js.Any] */](
      source: A,
      transform1: T1,
      transform2: T2,
      transform3: T3,
      destination: B,
      options: PipelineOptions
    ): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
    @scala.inline
    def pipeline[A /* <: PipelineSource[js.Any] */, T1 /* <: PipelineTransform[A, js.Any] */, T2 /* <: PipelineTransform[T1, js.Any] */, T3 /* <: PipelineTransform[T2, js.Any] */, T4 /* <: PipelineTransform[T3, js.Any] */, B /* <: PipelineDestination[T4, js.Any] */](
      source: A,
      transform1: T1,
      transform2: T2,
      transform3: T3,
      transform4: T4,
      destination: B,
      options: PipelineOptions
    ): PipelinePromise[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipelinePromise[B]]
  }
}
