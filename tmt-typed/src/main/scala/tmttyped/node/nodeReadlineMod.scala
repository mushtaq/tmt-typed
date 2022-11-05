package tmttyped.node

import org.scalajs.dom.ReadableStream
import tmttyped.node.anon.AutoCommit
import tmttyped.node.readlineMod.AsyncCompleter
import tmttyped.node.readlineMod.Completer
import tmttyped.node.readlineMod.Direction
import tmttyped.node.readlineMod.ReadLineOptions
import tmttyped.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeReadlineMod {
  
  @JSImport("node:readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:readline", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(input: ReadableStream[Any]) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(options: ReadLineOptions) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any]) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Completer, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(
      input: ReadableStream[Any],
      output: WritableStream[Any],
      completer: AsyncCompleter,
      terminal: Boolean
    ) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer, terminal: Boolean) = this()
  }
  
  inline def clearLine(stream: WritableStream[Any], dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def clearLine(stream: WritableStream[Any], dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clearScreenDown(stream: WritableStream[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def clearScreenDown(stream: WritableStream[Any], callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createInterface(input: ReadableStream[Any]): tmttyped.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Unit, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Completer): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any]): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Unit, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(
    input: ReadableStream[Any],
    output: WritableStream[Any],
    completer: AsyncCompleter,
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  inline def createInterface(options: ReadLineOptions): tmttyped.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlineMod.Interface]
  
  inline def cursorTo(stream: WritableStream[Any], x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream[Any], x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream[Any], x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream[Any], x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emitKeypressEvents(stream: ReadableStream[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def emitKeypressEvents(stream: ReadableStream[Any], readlineInterface: tmttyped.node.readlineMod.Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveCursor(stream: WritableStream[Any], dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def moveCursor(stream: WritableStream[Any], dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object promises {
    
    @JSImport("node:readline", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:readline", "promises.Interface")
    @js.native
    open class Interface protected () extends StObject {
      /**
        * NOTE: According to the documentation:
        *
        * > Instances of the `readline.Interface` class are constructed using the
        * > `readline.createInterface()` method.
        *
        * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
        */
      /* protected */ def this(input: ReadableStream[Any]) = this()
      /**
        * NOTE: According to the documentation:
        *
        * > Instances of the `readline.Interface` class are constructed using the
        * > `readline.createInterface()` method.
        *
        * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
        */
      /* protected */ def this(options: ReadLineOptions) = this()
      /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any]) = this()
      /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter) = this()
      /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Completer) = this()
      /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: AsyncCompleter) = this()
      /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer) = this()
      /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Unit, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Completer, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Unit, terminal: Boolean) = this()
      /* protected */ def this(
        input: ReadableStream[Any],
        output: WritableStream[Any],
        completer: AsyncCompleter,
        terminal: Boolean
      ) = this()
      /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer, terminal: Boolean) = this()
    }
    
    @JSImport("node:readline", "promises.Readline")
    @js.native
    open class Readline protected ()
      extends tmttyped.node.readlineMod.promises.Readline {
      /**
        * @param stream A TTY stream.
        */
      def this(stream: WritableStream[Any]) = this()
      def this(stream: WritableStream[Any], options: AutoCommit) = this()
    }
    
    /**
      * The `readlinePromises.createInterface()` method creates a new `readlinePromises.Interface` instance.
      *
      * ```js
      * const readlinePromises = require('node:readline/promises');
      * const rl = readlinePromises.createInterface({
      *   input: process.stdin,
      *   output: process.stdout
      * });
      * ```
      *
      * Once the `readlinePromises.Interface` instance is created, the most common case is to listen for the `'line'` event:
      *
      * ```js
      * rl.on('line', (line) => {
      *   console.log(`Received: ${line}`);
      * });
      * ```
      *
      * If `terminal` is `true` for this instance then the `output` stream will get the best compatibility if it defines an `output.columns` property,
      * and emits a `'resize'` event on the `output`, if or when the columns ever change (`process.stdout` does this automatically when it is a TTY).
      *
      * ## Use of the `completer` function
      *
      * The `completer` function takes the current line entered by the user as an argument, and returns an `Array` with 2 entries:
      *
      * - An Array with matching entries for the completion.
      * - The substring that was used for the matching.
      *
      * For instance: `[[substr1, substr2, ...], originalsubstring]`.
      *
      * ```js
      * function completer(line) {
      *   const completions = '.help .error .exit .quit .q'.split(' ');
      *   const hits = completions.filter((c) => c.startsWith(line));
      *   // Show all completions if none found
      *   return [hits.length ? hits : completions, line];
      * }
      * ```
      *
      * The `completer` function can also returns a `Promise`, or be asynchronous:
      *
      * ```js
      * async function completer(linePartial) {
      *   await someAsyncWork();
      *   return [['123'], linePartial];
      * }
      * ```
      */
    inline def createInterface(input: ReadableStream[Any]): tmttyped.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Unit, terminal: Boolean): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter, terminal: Boolean): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Completer): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Completer, terminal: Boolean): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any]): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Unit, terminal: Boolean): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: AsyncCompleter): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(
      input: ReadableStream[Any],
      output: WritableStream[Any],
      completer: AsyncCompleter,
      terminal: Boolean
    ): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer, terminal: Boolean): tmttyped.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
    inline def createInterface(options: ReadLineOptions): tmttyped.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlinePromisesMod.Interface]
  }
}
