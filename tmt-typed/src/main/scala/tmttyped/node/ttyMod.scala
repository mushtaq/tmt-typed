package tmttyped.node

import tmttyped.node.netMod.SocketConstructorOpts
import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.nodeStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ttyMod {
  
  @JSImport("tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tty", "ReadStream")
  @js.native
  class ReadStream protected () extends Socket {
    def this(fd: Double) = this()
    def this(fd: Double, options: SocketConstructorOpts) = this()
    
    var isRaw: Boolean = js.native
    
    var isTTY: Boolean = js.native
    
    def setRawMode(mode: Boolean): this.type = js.native
  }
  
  @JSImport("tty", "WriteStream")
  @js.native
  class WriteStream protected () extends Socket {
    def this(fd: Double) = this()
    
    @JSName("addListener")
    def addListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Clears the current line of this WriteStream in a direction identified by `dir`.
      */
    def clearLine(dir: Direction): Boolean = js.native
    def clearLine(dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
    
    /**
      * Clears this `WriteStream` from the current cursor down.
      */
    def clearScreenDown(): Boolean = js.native
    def clearScreenDown(callback: js.Function0[Unit]): Boolean = js.native
    
    var columns: Double = js.native
    
    /**
      * Moves this WriteStream's cursor to the specified position.
      */
    def cursorTo(x: Double): Boolean = js.native
    def cursorTo(x: Double, callback: js.Function0[Unit]): Boolean = js.native
    def cursorTo(x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = js.native
    def cursorTo(x: Double, y: Double): Boolean = js.native
    def cursorTo(x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
    
    @JSName("emit")
    def emit_resize(event: resize): Boolean = js.native
    
    /**
      * @default `process.env`
      */
    def getColorDepth(): Double = js.native
    def getColorDepth(env: js.Object): Double = js.native
    
    def getWindowSize(): js.Tuple2[Double, Double] = js.native
    
    def hasColors(): Boolean = js.native
    def hasColors(depth: Double): Boolean = js.native
    def hasColors(depth: Double, env: js.Object): Boolean = js.native
    def hasColors(env: js.Object): Boolean = js.native
    
    var isTTY: Boolean = js.native
    
    /**
      * Moves this WriteStream's cursor relative to its current position.
      */
    def moveCursor(dx: Double, dy: Double): Boolean = js.native
    def moveCursor(dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
    
    @JSName("on")
    def on_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
    
    var rows: Double = js.native
  }
  
  @scala.inline
  def isatty(fd: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isatty")(fd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * -1 - to the left from cursor
    *  0 - the entire line
    *  1 - to the right from cursor
    */
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
}
