package tmttyped.node

import tmttyped.node.anon.Once
import tmttyped.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("events", JSImport.Namespace)
  @js.native
  class ^ ()
    extends tmttyped.node.eventsMod.global.NodeJS.EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  @JSImport("events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("events", "captureRejectionSymbol")
  @js.native
  val captureRejectionSymbol: js.Symbol = js.native
  
  /**
    * Sets or gets the default captureRejection value for all emitters.
    */
  // TODO: These should be described using static getter/setter pairs:
  /* static member */
  @JSImport("events", "captureRejections")
  @js.native
  def captureRejections: Boolean = js.native
  @scala.inline
  def captureRejections_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("events", "defaultMaxListeners")
  @js.native
  def defaultMaxListeners: Double = js.native
  @scala.inline
  def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
  
  /**
    * This symbol shall be used to install a listener for only monitoring `'error'`
    * events. Listeners installed using this symbol are called before the regular
    * `'error'` listeners are called.
    *
    * Installing a listener using this symbol does not change the behavior once an
    * `'error'` event is emitted, therefore the process will still crash if no
    * regular `'error'` listener is installed.
    */
  /* static member */
  @JSImport("events", "errorMonitor")
  @js.native
  val errorMonitor: js.Symbol = js.native
  
  /** @deprecated since v4.0.0 */
  /* static member */
  @JSImport("events", "listenerCount")
  @js.native
  def listenerCount(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: java.lang.String): Double = js.native
  @JSImport("events", "listenerCount")
  @js.native
  def listenerCount(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: js.Symbol): Double = js.native
  
  /* static member */
  @JSImport("events", "on")
  @js.native
  def on(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: java.lang.String): AsyncIterableIterator[_] = js.native
  
  /* static member */
  @JSImport("events", "once")
  @js.native
  def once(emitter: DOMEventTarget, event: java.lang.String): js.Promise[js.Array[_]] = js.native
  /* static member */
  @JSImport("events", "once")
  @js.native
  def once(emitter: NodeEventTarget, event: java.lang.String): js.Promise[js.Array[_]] = js.native
  @JSImport("events", "once")
  @js.native
  def once(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[_]] = js.native
  
  @js.native
  trait DOMEventTarget extends StObject {
    
    def addEventListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
    def addEventListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit], opts: Once): js.Any = js.native
  }
  
  type EventEmitter = tmttyped.node.eventsMod.global.NodeJS.EventEmitter
  
  trait EventEmitterOptions extends StObject {
    
    /**
      * Enables automatic capturing of promise rejection.
      */
    var captureRejections: js.UndefOr[Boolean] = js.undefined
  }
  object EventEmitterOptions {
    
    @scala.inline
    def apply(): EventEmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventEmitterOptions]
    }
    
    @scala.inline
    implicit class EventEmitterOptionsMutableBuilder[Self <: EventEmitterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptureRejections(value: Boolean): Self = StObject.set(x, "captureRejections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureRejectionsUndefined: Self = StObject.set(x, "captureRejections", js.undefined)
    }
  }
  
  @js.native
  trait NodeEventTarget extends StObject {
    
    def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait EventEmitter extends StObject {
        
        def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
        def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
        
        def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
        
        def getMaxListeners(): Double = js.native
        
        def listenerCount(event: java.lang.String): Double = js.native
        def listenerCount(event: js.Symbol): Double = js.native
        
        def listeners(event: java.lang.String): js.Array[js.Function] = js.native
        def listeners(event: js.Symbol): js.Array[js.Function] = js.native
        
        def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        // Added in Node 6...
        def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
        def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
        
        def removeAllListeners(): this.type = js.native
        def removeAllListeners(event: java.lang.String): this.type = js.native
        def removeAllListeners(event: js.Symbol): this.type = js.native
        
        def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        def setMaxListeners(n: Double): this.type = js.native
      }
    }
  }
}
