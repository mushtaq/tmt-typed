package tmttyped.node

import tmttyped.node.anon.Once
import tmttyped.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
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
  @JSImport("events", JSImport.Namespace)
  @js.native
  class ^ () extends StObject {
    def this(options: EventEmitterOptions) = this()
  }
  @JSImport("events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("events", "EventEmitter")
  @js.native
  class EventEmitter ()
    extends StObject
       with tmttyped.node.eventsMod.global.NodeJS.EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  object EventEmitter {
    
    @JSImport("events", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("events", "EventEmitter.captureRejectionSymbol")
    @js.native
    val captureRejectionSymbol: js.Symbol = js.native
    
    /**
      * Sets or gets the default captureRejection value for all emitters.
      */
    // TODO: These should be described using static getter/setter pairs:
    /* static member */
    @JSImport("events", "EventEmitter.captureRejections")
    @js.native
    def captureRejections: Boolean = js.native
    @scala.inline
    def captureRejections_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("events", "EventEmitter.defaultMaxListeners")
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
    @JSImport("events", "EventEmitter.errorMonitor")
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
    def getEventListener(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, name: java.lang.String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
    @scala.inline
    def getEventListener(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
    
    /** @deprecated since v4.0.0 */
    /* static member */
    @scala.inline
    def listenerCount(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def listenerCount(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: js.Symbol): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    @scala.inline
    def on(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: java.lang.String): AsyncIterableIterator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[js.Any]]
    @scala.inline
    def on(
      emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter,
      event: java.lang.String,
      options: StaticEventEmitterOptions
    ): AsyncIterableIterator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[js.Any]]
    
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
  
  /**
    * Returns a list listener for a specific emitter event name.
    */
  /* static member */
  @scala.inline
  def getEventListener(emitter: DOMEventTarget, name: java.lang.String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def getEventListener(emitter: DOMEventTarget, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def getEventListener(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, name: java.lang.String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  @scala.inline
  def getEventListener(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListener")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  
  /** @deprecated since v4.0.0 */
  /* static member */
  @scala.inline
  def listenerCount(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def listenerCount(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: js.Symbol): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  @scala.inline
  def on(emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter, event: java.lang.String): AsyncIterableIterator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[js.Any]]
  @scala.inline
  def on(
    emitter: tmttyped.node.eventsMod.global.NodeJS.EventEmitter,
    event: java.lang.String,
    options: StaticEventEmitterOptions
  ): AsyncIterableIterator[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[js.Any]]
  
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
  
  trait Abortable extends StObject {
    
    /**
      * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object Abortable {
    
    @scala.inline
    def apply(): Abortable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Abortable]
    }
    
    @scala.inline
    implicit class AbortableMutableBuilder[Self <: Abortable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  @js.native
  trait DOMEventTarget extends StObject {
    
    def addEventListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
    def addEventListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit], opts: Once): js.Any = js.native
  }
  
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
  
  trait StaticEventEmitterOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object StaticEventEmitterOptions {
    
    @scala.inline
    def apply(): StaticEventEmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticEventEmitterOptions]
    }
    
    @scala.inline
    implicit class StaticEventEmitterOptionsMutableBuilder[Self <: StaticEventEmitterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait EventEmitter extends StObject {
        
        /**
          * Alias for `emitter.on(eventName, listener)`.
          * @since v0.1.26
          */
        def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * Synchronously calls each of the listeners registered for the event named`eventName`, in the order they were registered, passing the supplied arguments
          * to each.
          *
          * Returns `true` if the event had listeners, `false` otherwise.
          *
          * ```js
          * const EventEmitter = require('events');
          * const myEmitter = new EventEmitter();
          *
          * // First listener
          * myEmitter.on('event', function firstListener() {
          *   console.log('Helloooo! first listener');
          * });
          * // Second listener
          * myEmitter.on('event', function secondListener(arg1, arg2) {
          *   console.log(`event with parameters ${arg1}, ${arg2} in second listener`);
          * });
          * // Third listener
          * myEmitter.on('event', function thirdListener(...args) {
          *   const parameters = args.join(', ');
          *   console.log(`event with parameters ${parameters} in third listener`);
          * });
          *
          * console.log(myEmitter.listeners('event'));
          *
          * myEmitter.emit('event', 1, 2, 3, 4, 5);
          *
          * // Prints:
          * // [
          * //   [Function: firstListener],
          * //   [Function: secondListener],
          * //   [Function: thirdListener]
          * // ]
          * // Helloooo! first listener
          * // event with parameters 1, 2 in second listener
          * // event with parameters 1, 2, 3, 4, 5 in third listener
          * ```
          * @since v0.1.26
          */
        def emit(event: java.lang.String, args: js.Any*): Boolean = js.native
        def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
        
        /**
          * Returns an array listing the events for which the emitter has registered
          * listeners. The values in the array are strings or `Symbol`s.
          *
          * ```js
          * const EventEmitter = require('events');
          * const myEE = new EventEmitter();
          * myEE.on('foo', () => {});
          * myEE.on('bar', () => {});
          *
          * const sym = Symbol('symbol');
          * myEE.on(sym, () => {});
          *
          * console.log(myEE.eventNames());
          * // Prints: [ 'foo', 'bar', Symbol(symbol) ]
          * ```
          * @since v6.0.0
          */
        def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
        
        /**
          * Returns the current max listener value for the `EventEmitter` which is either
          * set by `emitter.setMaxListeners(n)` or defaults to {@link defaultMaxListeners}.
          * @since v1.0.0
          */
        def getMaxListeners(): Double = js.native
        
        /**
          * Returns the number of listeners listening to the event named `eventName`.
          * @since v3.2.0
          * @param eventName The name of the event being listened for
          */
        def listenerCount(event: java.lang.String): Double = js.native
        def listenerCount(event: js.Symbol): Double = js.native
        
        /**
          * Returns a copy of the array of listeners for the event named `eventName`.
          *
          * ```js
          * server.on('connection', (stream) => {
          *   console.log('someone connected!');
          * });
          * console.log(util.inspect(server.listeners('connection')));
          * // Prints: [ [Function] ]
          * ```
          * @since v0.1.26
          */
        def listeners(event: java.lang.String): js.Array[js.Function] = js.native
        def listeners(event: js.Symbol): js.Array[js.Function] = js.native
        
        /**
          * Alias for `emitter.removeListener()`.
          * @since v10.0.0
          */
        def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * Adds the `listener` function to the end of the listeners array for the
          * event named `eventName`. No checks are made to see if the `listener` has
          * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
          * times.
          *
          * ```js
          * server.on('connection', (stream) => {
          *   console.log('someone connected!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          *
          * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
          * event listener to the beginning of the listeners array.
          *
          * ```js
          * const myEE = new EventEmitter();
          * myEE.on('foo', () => console.log('a'));
          * myEE.prependListener('foo', () => console.log('b'));
          * myEE.emit('foo');
          * // Prints:
          * //   b
          * //   a
          * ```
          * @since v0.1.101
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * Adds a **one-time**`listener` function for the event named `eventName`. The
          * next time `eventName` is triggered, this listener is removed and then invoked.
          *
          * ```js
          * server.once('connection', (stream) => {
          *   console.log('Ah, we have our first user!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          *
          * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
          * event listener to the beginning of the listeners array.
          *
          * ```js
          * const myEE = new EventEmitter();
          * myEE.once('foo', () => console.log('a'));
          * myEE.prependOnceListener('foo', () => console.log('b'));
          * myEE.emit('foo');
          * // Prints:
          * //   b
          * //   a
          * ```
          * @since v0.3.0
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * Adds the `listener` function to the _beginning_ of the listeners array for the
          * event named `eventName`. No checks are made to see if the `listener` has
          * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
          * times.
          *
          * ```js
          * server.prependListener('connection', (stream) => {
          *   console.log('someone connected!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v6.0.0
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * Adds a **one-time**`listener` function for the event named `eventName` to the_beginning_ of the listeners array. The next time `eventName` is triggered, this
          * listener is removed, and then invoked.
          *
          * ```js
          * server.prependOnceListener('connection', (stream) => {
          *   console.log('Ah, we have our first user!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v6.0.0
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * Returns a copy of the array of listeners for the event named `eventName`,
          * including any wrappers (such as those created by `.once()`).
          *
          * ```js
          * const emitter = new EventEmitter();
          * emitter.once('log', () => console.log('log once'));
          *
          * // Returns a new Array with a function `onceWrapper` which has a property
          * // `listener` which contains the original listener bound above
          * const listeners = emitter.rawListeners('log');
          * const logFnWrapper = listeners[0];
          *
          * // Logs "log once" to the console and does not unbind the `once` event
          * logFnWrapper.listener();
          *
          * // Logs "log once" to the console and removes the listener
          * logFnWrapper();
          *
          * emitter.on('log', () => console.log('log persistently'));
          * // Will return a new Array with a single function bound by `.on()` above
          * const newListeners = emitter.rawListeners('log');
          *
          * // Logs "log persistently" twice
          * newListeners[0]();
          * emitter.emit('log');
          * ```
          * @since v9.4.0
          */
        def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
        def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
        
        /**
          * Removes all listeners, or those of the specified `eventName`.
          *
          * It is bad practice to remove listeners added elsewhere in the code,
          * particularly when the `EventEmitter` instance was created by some other
          * component or module (e.g. sockets or file streams).
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v0.1.26
          */
        def removeAllListeners(): this.type = js.native
        def removeAllListeners(event: java.lang.String): this.type = js.native
        def removeAllListeners(event: js.Symbol): this.type = js.native
        
        /**
          * Removes the specified `listener` from the listener array for the event named`eventName`.
          *
          * ```js
          * const callback = (stream) => {
          *   console.log('someone connected!');
          * };
          * server.on('connection', callback);
          * // ...
          * server.removeListener('connection', callback);
          * ```
          *
          * `removeListener()` will remove, at most, one instance of a listener from the
          * listener array. If any single listener has been added multiple times to the
          * listener array for the specified `eventName`, then `removeListener()` must be
          * called multiple times to remove each instance.
          *
          * Once an event is emitted, all listeners attached to it at the
          * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and_before_ the last listener finishes execution will
          * not remove them from`emit()` in progress. Subsequent events behave as expected.
          *
          * ```js
          * const myEmitter = new MyEmitter();
          *
          * const callbackA = () => {
          *   console.log('A');
          *   myEmitter.removeListener('event', callbackB);
          * };
          *
          * const callbackB = () => {
          *   console.log('B');
          * };
          *
          * myEmitter.on('event', callbackA);
          *
          * myEmitter.on('event', callbackB);
          *
          * // callbackA removes listener callbackB but it will still be called.
          * // Internal listener array at time of emit [callbackA, callbackB]
          * myEmitter.emit('event');
          * // Prints:
          * //   A
          * //   B
          *
          * // callbackB is now removed.
          * // Internal listener array [callbackA]
          * myEmitter.emit('event');
          * // Prints:
          * //   A
          * ```
          *
          * Because listeners are managed using an internal array, calling this will
          * change the position indices of any listener registered _after_ the listener
          * being removed. This will not impact the order in which listeners are called,
          * but it means that any copies of the listener array as returned by
          * the `emitter.listeners()` method will need to be recreated.
          *
          * When a single function has been added as a handler multiple times for a single
          * event (as in the example below), `removeListener()` will remove the most
          * recently added instance. In the example the `once('ping')`listener is removed:
          *
          * ```js
          * const ee = new EventEmitter();
          *
          * function pong() {
          *   console.log('pong');
          * }
          *
          * ee.on('ping', pong);
          * ee.once('ping', pong);
          * ee.removeListener('ping', pong);
          *
          * ee.emit('ping');
          * ee.emit('ping');
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v0.1.26
          */
        def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
        
        /**
          * By default `EventEmitter`s will print a warning if more than `10` listeners are
          * added for a particular event. This is a useful default that helps finding
          * memory leaks. The `emitter.setMaxListeners()` method allows the limit to be
          * modified for this specific `EventEmitter` instance. The value can be set to`Infinity` (or `0`) to indicate an unlimited number of listeners.
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v0.3.5
          */
        def setMaxListeners(n: Double): this.type = js.native
      }
    }
  }
}
