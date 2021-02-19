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
  @JSImport("node:readline", "clearLine")
  @js.native
  def clearLine(stream: WritableStream, dir: Direction): Boolean = js.native
  @JSImport("node:readline", "clearLine")
  @js.native
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  @JSImport("node:readline", "clearScreenDown")
  @js.native
  def clearScreenDown(stream: WritableStream): Boolean = js.native
  @JSImport("node:readline", "clearScreenDown")
  @js.native
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: AsyncCompleter,
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: WritableStream,
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): tmttyped.node.readlineMod.Interface = js.native
  @JSImport("node:readline", "createInterface")
  @js.native
  def createInterface(options: ReadLineOptions): tmttyped.node.readlineMod.Interface = js.native
  
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  @JSImport("node:readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double): Boolean = js.native
  @JSImport("node:readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = js.native
  @JSImport("node:readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  @JSImport("node:readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("node:readline", "emitKeypressEvents")
  @js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  @JSImport("node:readline", "emitKeypressEvents")
  @js.native
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: tmttyped.node.readlineMod.Interface): Unit = js.native
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  @JSImport("node:readline", "moveCursor")
  @js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  @JSImport("node:readline", "moveCursor")
  @js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
}
