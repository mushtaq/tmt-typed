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
  
  @JSImport("node:readline", "Interface")
  @js.native
  class Interface protected ()
    extends tmttyped.node.readlineMod.Interface {
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
    protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: js.UndefOr[scala.Nothing],
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: AsyncCompleter,
      terminal: Boolean
    ) = this()
    protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean) = this()
    protected def this(
      input: ReadableStream,
      output: WritableStream,
      completer: js.UndefOr[scala.Nothing],
      terminal: Boolean
    ) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
  }
  
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  @scala.inline
  def clearLine(stream: WritableStream, dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  @scala.inline
  def clearScreenDown(stream: WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def createInterface(input: ReadableStream): tmttyped.node.readlineMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: AsyncCompleter,
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
  @scala.inline
  def createInterface(
    input: ReadableStream,
    output: WritableStream,
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.readlineMod.Interface]
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
    * Moves this WriteStream's cursor to the specified position.
    */
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: tmttyped.node.readlineMod.Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  @scala.inline
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
