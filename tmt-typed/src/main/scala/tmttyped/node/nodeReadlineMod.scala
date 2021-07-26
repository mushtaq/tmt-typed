package tmttyped.node

import tmttyped.node.NodeJS.ReadableStream
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.readlineMod.AsyncCompleter
import tmttyped.node.readlineMod.Completer
import tmttyped.node.readlineMod.Direction
import tmttyped.node.readlineMod.ReadLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeReadlineMod {
  
  @JSImport("node:readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of the `readline.Interface` class are constructed using the`readline.createInterface()` method. Every instance is associated with a
    * single `input` `Readable` stream and a single `output` `Writable` stream.
    * The `output` stream is used to print prompts for user input that arrives on,
    * and is read from, the `input` stream.
    * @since v0.1.104
    */
  @JSImport("node:readline", "Interface")
  @js.native
  class Interface protected () extends StObject {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    protected def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    protected def this(options: ReadLineOptions) = this()
    protected def this(input: ReadableStream, output: WritableStream) = this()
    protected def this(input: ReadableStream, output: Unit, completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: Unit, completer: Completer) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    protected def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
  }
  
  /**
    * The `readline.clearLine()` method clears current line of given `TTY` stream
    * in a specified direction identified by `dir`.
    * @since v0.7.7
    * @param callback Invoked once the operation completes.
    * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
    */
  @scala.inline
  def clearLine(stream: WritableStream, dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * The `readline.clearScreenDown()` method clears the given `TTY` stream from
    * the current position of the cursor down.
    * @since v0.7.7
    * @param callback Invoked once the operation completes.
    * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
    */
  @scala.inline
  def clearScreenDown(stream: WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * The `readline.createInterface()` method creates a new `readline.Interface`instance.
    *
    * ```js
    * const readline = require('readline');
    * const rl = readline.createInterface({
    *   input: process.stdin,
    *   output: process.stdout
    * });
    * ```
    *
    * Once the `readline.Interface` instance is created, the most common case is to
    * listen for the `'line'` event:
    *
    * ```js
    * rl.on('line', (line) => {
    *   console.log(`Received: ${line}`);
    * });
    * ```
    *
    * If `terminal` is `true` for this instance then the `output` stream will get
    * the best compatibility if it defines an `output.columns` property and emits
    * a `'resize'` event on the `output` if or when the columns ever change
    * (`process.stdout` does this automatically when it is a TTY).
    *
    * When creating a `readline.Interface` using `stdin` as input, the program
    * will not terminate until it receives `EOF` (Ctrl+D on
    * Linux/macOS, Ctrl+Z followed by Return on
    * Windows).
    * If you want your application to exit without waiting for user input, you can `unref()` the standard input stream:
    *
    * ```js
    * process.stdin.unref();
    * ```
    * @since v0.1.98
    */
  @scala.inline
  def createInterface(input: ReadableStream): tmttyped.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Completer): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(options: ReadLineOptions): tmttyped.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlineMod.Interface]
  
  /**
    * The `readline.cursorTo()` method moves cursor to the specified position in a
    * given `TTY` `stream`.
    * @since v0.7.7
    * @param callback Invoked once the operation completes.
    * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
    */
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * The `readline.emitKeypressEvents()` method causes the given `Readable` stream to begin emitting `'keypress'` events corresponding to received input.
    *
    * Optionally, `interface` specifies a `readline.Interface` instance for which
    * autocompletion is disabled when copy-pasted input is detected.
    *
    * If the `stream` is a `TTY`, then it must be in raw mode.
    *
    * This is automatically called by any readline instance on its `input` if the`input` is a terminal. Closing the `readline` instance does not stop
    * the `input` from emitting `'keypress'` events.
    *
    * ```js
    * readline.emitKeypressEvents(process.stdin);
    * if (process.stdin.isTTY)
    *   process.stdin.setRawMode(true);
    * ```
    * @since v0.7.7
    */
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: tmttyped.node.readlineMod.Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The `readline.moveCursor()` method moves the cursor _relative_ to its current
    * position in a given `TTY` `stream`.
    *
    * ## Example: Tiny CLI
    *
    * The following example illustrates the use of `readline.Interface` class to
    * implement a small command-line interface:
    *
    * ```js
    * const readline = require('readline');
    * const rl = readline.createInterface({
    *   input: process.stdin,
    *   output: process.stdout,
    *   prompt: 'OHAI> '
    * });
    *
    * rl.prompt();
    *
    * rl.on('line', (line) => {
    *   switch (line.trim()) {
    *     case 'hello':
    *       console.log('world!');
    *       break;
    *     default:
    *       console.log(`Say what? I might have heard '${line.trim()}'`);
    *       break;
    *   }
    *   rl.prompt();
    * }).on('close', () => {
    *   console.log('Have a great day!');
    *   process.exit(0);
    * });
    * ```
    *
    * ## Example: Read file stream line-by-Line
    *
    * A common use case for `readline` is to consume an input file one line at a
    * time. The easiest way to do so is leveraging the `fs.ReadStream` API as
    * well as a `for await...of` loop:
    *
    * ```js
    * const fs = require('fs');
    * const readline = require('readline');
    *
    * async function processLineByLine() {
    *   const fileStream = fs.createReadStream('input.txt');
    *
    *   const rl = readline.createInterface({
    *     input: fileStream,
    *     crlfDelay: Infinity
    *   });
    *   // Note: we use the crlfDelay option to recognize all instances of CR LF
    *   // ('\r\n') in input.txt as a single line break.
    *
    *   for await (const line of rl) {
    *     // Each line in input.txt will be successively available here as `line`.
    *     console.log(`Line from file: ${line}`);
    *   }
    * }
    *
    * processLineByLine();
    * ```
    *
    * Alternatively, one could use the `'line'` event:
    *
    * ```js
    * const fs = require('fs');
    * const readline = require('readline');
    *
    * const rl = readline.createInterface({
    *   input: fs.createReadStream('sample.txt'),
    *   crlfDelay: Infinity
    * });
    *
    * rl.on('line', (line) => {
    *   console.log(`Line from file: ${line}`);
    * });
    * ```
    *
    * Currently, `for await...of` loop can be a bit slower. If `async` / `await`flow and speed are both essential, a mixed approach can be applied:
    *
    * ```js
    * const { once } = require('events');
    * const { createReadStream } = require('fs');
    * const { createInterface } = require('readline');
    *
    * (async function processLineByLine() {
    *   try {
    *     const rl = createInterface({
    *       input: createReadStream('big-file.txt'),
    *       crlfDelay: Infinity
    *     });
    *
    *     rl.on('line', (line) => {
    *       // Process the line.
    *     });
    *
    *     await once(rl, 'close');
    *
    *     console.log('File processed.');
    *   } catch (err) {
    *     console.error(err);
    *   }
    * })();
    * ```
    * @since v0.7.7
    * @param callback Invoked once the operation completes.
    * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
    */
  @scala.inline
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
