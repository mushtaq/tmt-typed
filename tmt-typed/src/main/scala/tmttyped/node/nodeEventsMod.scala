package tmttyped.node

import tmttyped.node.eventsMod.DOMEventTarget
import tmttyped.node.eventsMod.EventEmitterOptions
import tmttyped.node.eventsMod.NodeEventTarget
import tmttyped.node.eventsMod.StaticEventEmitterOptions
import tmttyped.node.eventsMod.global.NodeJS.EventEmitter
import tmttyped.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeEventsMod {
  
  /**
    * The `EventEmitter` class is defined and exposed by the `events` module:
    *
    * ```js
    * const EventEmitter = require('events');
    * ```
    *
    * All `EventEmitter`s emit the event `'newListener'` when new listeners are
    * added and `'removeListener'` when existing listeners are removed.
    *
    * It supports the following option:
    * @since v0.1.26
    */
  @JSImport("node:events", JSImport.Namespace)
  @js.native
  class ^ () extends StObject {
    def this(options: EventEmitterOptions) = this()
  }
  @JSImport("node:events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("node:events", "captureRejectionSymbol")
  @js.native
  val captureRejectionSymbol: js.Symbol = js.native
  
  /**
    * Sets or gets the default captureRejection value for all emitters.
    */
  // TODO: These should be described using static getter/setter pairs:
  /* static member */
  @JSImport("node:events", "captureRejections")
  @js.native
  def captureRejections: Boolean = js.native
  @scala.inline
  def captureRejections_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node:events", "defaultMaxListeners")
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
  @JSImport("node:events", "errorMonitor")
  @js.native
  val errorMonitor: js.Symbol = js.native
  
  /**
    * Returns a list listener for a specific emitter event name.
    */
  /* static member */
  @scala.inline
  def getEventListener(emitter: DOMEventTarget, name: java.lang.String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def getEventListener(emitter: DOMEventTarget, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def getEventListener(emitter: EventEmitter, name: java.lang.String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def getEventListener(emitter: EventEmitter, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  
  /** @deprecated since v4.0.0 */
  /* static member */
  @scala.inline
  def listenerCount(emitter: EventEmitter, event: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def listenerCount(emitter: EventEmitter, event: js.Symbol): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def on(emitter: EventEmitter, event: java.lang.String): AsyncIterableIterator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[js.Any]]
  @scala.inline
  def on(emitter: EventEmitter, event: java.lang.String, options: StaticEventEmitterOptions): AsyncIterableIterator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[js.Any]]
  
  /* static member */
  @scala.inline
  def once(emitter: DOMEventTarget, event: java.lang.String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def once(emitter: DOMEventTarget, event: java.lang.String, options: StaticEventEmitterOptions): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  /* static member */
  @scala.inline
  def once(emitter: NodeEventTarget, event: java.lang.String): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def once(emitter: NodeEventTarget, event: java.lang.String, options: StaticEventEmitterOptions): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def once(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  @scala.inline
  def once(emitter: NodeEventTarget, event: js.Symbol, options: StaticEventEmitterOptions): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
}
