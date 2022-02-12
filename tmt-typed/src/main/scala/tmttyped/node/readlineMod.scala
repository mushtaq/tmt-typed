package tmttyped.node

import tmttyped.node.NodeJS.ReadableStream
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.eventsMod.Abortable
import tmttyped.node.nodeStrings.SIGCONT
import tmttyped.node.nodeStrings.SIGINT
import tmttyped.node.nodeStrings.SIGTSTP
import tmttyped.node.nodeStrings.close
import tmttyped.node.nodeStrings.history
import tmttyped.node.nodeStrings.pause
import tmttyped.node.nodeStrings.resume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of the `readline.Interface` class are constructed using the`readline.createInterface()` method. Every instance is associated with a
    * single `input` `Readable` stream and a single `output` `Writable` stream.
    * The `output` stream is used to print prompts for user input that arrives on,
    * and is read from, the `input` stream.
    * @since v0.1.104
    */
  @JSImport("readline", "Interface")
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
    /* protected */ def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(options: ReadLineOptions) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
    
    /**
      * events.EventEmitter
      * 1. close
      * 2. line
      * 3. pause
      * 4. resume
      * 5. SIGCONT
      * 6. SIGINT
      * 7. SIGTSTP
      * 8. history
      */
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_line(event: tmttyped.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The `rl.close()` method closes the `readline.Interface` instance and
      * relinquishes control over the `input` and `output` streams. When called,
      * the `'close'` event will be emitted.
      *
      * Calling `rl.close()` does not immediately stop other events (including `'line'`)
      * from being emitted by the `readline.Interface` instance.
      * @since v0.1.98
      */
    def close(): Unit = js.native
    
    /**
      * The cursor position relative to `rl.line`.
      *
      * This will track where the current cursor lands in the input string, when
      * reading input from a TTY stream. The position of cursor determines the
      * portion of the input string that will be modified as input is processed,
      * as well as the column where the terminal caret will be rendered.
      * @since v0.1.98
      */
    val cursor: Double = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_SIGCONT(event: SIGCONT): Boolean = js.native
    @JSName("emit")
    def emit_SIGINT(event: SIGINT): Boolean = js.native
    @JSName("emit")
    def emit_SIGTSTP(event: SIGTSTP): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_history(event: history, history: js.Array[String]): Boolean = js.native
    @JSName("emit")
    def emit_line(event: tmttyped.node.nodeStrings.line, input: String): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    /**
      * Returns the real position of the cursor in relation to the input
      * prompt + string. Long input (wrapping) strings, as well as multiple
      * line prompts are included in the calculations.
      * @since v13.5.0, v12.16.0
      */
    def getCursorPos(): CursorPos = js.native
    
    /**
      * The `rl.getPrompt()` method returns the current prompt used by `rl.prompt()`.
      * @since v15.3.0
      * @return the current prompt string
      */
    def getPrompt(): String = js.native
    
    /**
      * The current input data being processed by node.
      *
      * This can be used when collecting input from a TTY stream to retrieve the
      * current value that has been processed thus far, prior to the `line` event
      * being emitted. Once the `line` event has been emitted, this property will
      * be an empty string.
      *
      * Be aware that modifying the value during the instance runtime may have
      * unintended consequences if `rl.cursor` is not also controlled.
      *
      * **If not using a TTY stream for input, use the `'line'` event.**
      *
      * One possible use case would be as follows:
      *
      * ```js
      * const values = ['lorem ipsum', 'dolor sit amet'];
      * const rl = readline.createInterface(process.stdin);
      * const showResults = debounce(() => {
      *   console.log(
      *     '\n',
      *     values.filter((val) => val.startsWith(rl.line)).join(' ')
      *   );
      * }, 300);
      * process.stdin.on('keypress', (c, k) => {
      *   showResults();
      * });
      * ```
      * @since v0.1.98
      */
    val line: String = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("on")
    def on_line(event: tmttyped.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("once")
    def once_line(event: tmttyped.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The `rl.pause()` method pauses the `input` stream, allowing it to be resumed
      * later if necessary.
      *
      * Calling `rl.pause()` does not immediately pause other events (including`'line'`) from being emitted by the `readline.Interface` instance.
      * @since v0.3.4
      */
    def pause(): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_line(event: tmttyped.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_line(event: tmttyped.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The `rl.prompt()` method writes the `readline.Interface` instances configured`prompt` to a new line in `output` in order to provide a user with a new
      * location at which to provide input.
      *
      * When called, `rl.prompt()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `readline.Interface` was created with `output` set to `null` or`undefined` the prompt is not written.
      * @since v0.1.98
      * @param preserveCursor If `true`, prevents the cursor placement from being reset to `0`.
      */
    def prompt(): Unit = js.native
    def prompt(preserveCursor: Boolean): Unit = js.native
    
    /**
      * The `rl.question()` method displays the `query` by writing it to the `output`,
      * waits for user input to be provided on `input`, then invokes the `callback`function passing the provided input as the first argument.
      *
      * When called, `rl.question()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `readline.Interface` was created with `output` set to `null` or`undefined` the `query` is not written.
      *
      * The `callback` function passed to `rl.question()` does not follow the typical
      * pattern of accepting an `Error` object or `null` as the first argument.
      * The `callback` is called with the provided answer as the only argument.
      *
      * Example usage:
      *
      * ```js
      * rl.question('What is your favorite food? ', (answer) => {
      *   console.log(`Oh, so your favorite food is ${answer}`);
      * });
      * ```
      *
      * Using an `AbortController` to cancel a question.
      *
      * ```js
      * const ac = new AbortController();
      * const signal = ac.signal;
      *
      * rl.question('What is your favorite food? ', { signal }, (answer) => {
      *   console.log(`Oh, so your favorite food is ${answer}`);
      * });
      *
      * signal.addEventListener('abort', () => {
      *   console.log('The food question timed out');
      * }, { once: true });
      *
      * setTimeout(() => ac.abort(), 10000);
      * ```
      *
      * If this method is invoked as it's util.promisify()ed version, it returns a
      * Promise that fulfills with the answer. If the question is canceled using
      * an `AbortController` it will reject with an `AbortError`.
      *
      * ```js
      * const util = require('util');
      * const question = util.promisify(rl.question).bind(rl);
      *
      * async function questionExample() {
      *   try {
      *     const answer = await question('What is you favorite food? ');
      *     console.log(`Oh, so your favorite food is ${answer}`);
      *   } catch (err) {
      *     console.error('Question rejected', err);
      *   }
      * }
      * questionExample();
      * ```
      * @since v0.3.3
      * @param query A statement or query to write to `output`, prepended to the prompt.
      * @param callback A callback function that is invoked with the user's input in response to the `query`.
      */
    def question(query: String, callback: js.Function1[/* answer */ String, Unit]): Unit = js.native
    def question(query: String, options: Abortable, callback: js.Function1[/* answer */ String, Unit]): Unit = js.native
    
    /**
      * The `rl.resume()` method resumes the `input` stream if it has been paused.
      * @since v0.3.4
      */
    def resume(): this.type = js.native
    
    /**
      * The `rl.setPrompt()` method sets the prompt that will be written to `output`whenever `rl.prompt()` is called.
      * @since v0.1.98
      */
    def setPrompt(prompt: String): Unit = js.native
    
    val terminal: Boolean = js.native
    
    /**
      * The `rl.write()` method will write either `data` or a key sequence identified
      * by `key` to the `output`. The `key` argument is supported only if `output` is
      * a `TTY` text terminal. See `TTY keybindings` for a list of key
      * combinations.
      *
      * If `key` is specified, `data` is ignored.
      *
      * When called, `rl.write()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `readline.Interface` was created with `output` set to `null` or`undefined` the `data` and `key` are not written.
      *
      * ```js
      * rl.write('Delete this!');
      * // Simulate Ctrl+U to delete the line written previously
      * rl.write(null, { ctrl: true, name: 'u' });
      * ```
      *
      * The `rl.write()` method will write the data to the `readline` `Interface`'s`input`_as if it were provided by the user_.
      * @since v0.1.98
      */
    def write(data: String): Unit = js.native
    def write(data: String, key: Key): Unit = js.native
    def write(data: Null, key: Key): Unit = js.native
    def write(data: Unit, key: Key): Unit = js.native
    def write(data: Buffer): Unit = js.native
    def write(data: Buffer, key: Key): Unit = js.native
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
  def createInterface(input: ReadableStream): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Completer): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(options: ReadLineOptions): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[Interface]
  
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
    */
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  type AsyncCompleter = js.Function2[
    /* line */ String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* result */ js.UndefOr[CompleterResult], 
      Unit
    ], 
    Unit
  ]
  
  // type forwarded for backwards compatibility
  type Completer = js.Function1[/* line */ String, CompleterResult]
  
  type CompleterResult = js.Tuple2[js.Array[String], String]
  
  trait CursorPos extends StObject {
    
    var cols: Double
    
    var rows: Double
  }
  object CursorPos {
    
    @scala.inline
    def apply(cols: Double, rows: Double): CursorPos = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorPos]
    }
    
    @scala.inline
    implicit class CursorPosMutableBuilder[Self <: CursorPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.nodeNumbers.`-1`
    - tmttyped.node.nodeNumbers.`0`
    - tmttyped.node.nodeNumbers.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def `-1`: tmttyped.node.nodeNumbers.`-1` = -1.asInstanceOf[tmttyped.node.nodeNumbers.`-1`]
    
    @scala.inline
    def `0`: tmttyped.node.nodeNumbers.`0` = 0.asInstanceOf[tmttyped.node.nodeNumbers.`0`]
    
    @scala.inline
    def `1`: tmttyped.node.nodeNumbers.`1` = 1.asInstanceOf[tmttyped.node.nodeNumbers.`1`]
  }
  
  trait Key extends StObject {
    
    var ctrl: js.UndefOr[Boolean] = js.undefined
    
    var meta: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sequence: js.UndefOr[String] = js.undefined
    
    var shift: js.UndefOr[Boolean] = js.undefined
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
      
      @scala.inline
      def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    }
  }
  
  type ReadLine = Interface
  
  trait ReadLineOptions extends StObject {
    
    var completer: js.UndefOr[Completer | AsyncCompleter] = js.undefined
    
    var crlfDelay: js.UndefOr[Double] = js.undefined
    
    var escapeCodeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      *  Initial list of history lines. This option makes sense
      * only if `terminal` is set to `true` by the user or by an internal `output`
      * check, otherwise the history caching mechanism is not initialized at all.
      * @default []
      */
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    var historySize: js.UndefOr[Double] = js.undefined
    
    var input: ReadableStream
    
    var output: js.UndefOr[WritableStream] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, when a new input line added
      * to the history list duplicates an older one, this removes the older line
      * from the list.
      * @default false
      */
    var removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var terminal: js.UndefOr[Boolean] = js.undefined
  }
  object ReadLineOptions {
    
    @scala.inline
    def apply(input: ReadableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
    
    @scala.inline
    implicit class ReadLineOptionsMutableBuilder[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleter(value: Completer | AsyncCompleter): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleterFunction1(value: /* line */ String => CompleterResult): Self = StObject.set(x, "completer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleterFunction2(
        value: (/* line */ String, /* callback */ js.Function2[
              /* err */ js.UndefOr[Null | js.Error], 
              /* result */ js.UndefOr[CompleterResult], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "completer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompleterUndefined: Self = StObject.set(x, "completer", js.undefined)
      
      @scala.inline
      def setCrlfDelay(value: Double): Self = StObject.set(x, "crlfDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlfDelayUndefined: Self = StObject.set(x, "crlfDelay", js.undefined)
      
      @scala.inline
      def setEscapeCodeTimeout(value: Double): Self = StObject.set(x, "escapeCodeTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCodeTimeoutUndefined: Self = StObject.set(x, "escapeCodeTimeout", js.undefined)
      
      @scala.inline
      def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistorySize(value: Double): Self = StObject.set(x, "historySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistorySizeUndefined: Self = StObject.set(x, "historySize", js.undefined)
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRemoveHistoryDuplicates(value: Boolean): Self = StObject.set(x, "removeHistoryDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveHistoryDuplicatesUndefined: Self = StObject.set(x, "removeHistoryDuplicates", js.undefined)
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    }
  }
}
