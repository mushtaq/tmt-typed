package tmttyped.node

import tmttyped.node.anon.Message
import tmttyped.node.eventsMod.EventEmitterOptions
import tmttyped.node.nodeUrlMod.URL
import tmttyped.node.vmMod.Context
import tmttyped.node.workerThreadsMod.ResourceLimits_
import tmttyped.node.workerThreadsMod.WorkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeWorkerThreadsMod {
  
  @JSImport("node:worker_threads", "MessageChannel")
  @js.native
  class MessageChannel ()
    extends tmttyped.node.workerThreadsMod.MessageChannel
  
  @JSImport("node:worker_threads", "MessagePort")
  @js.native
  class MessagePort ()
    extends tmttyped.node.workerThreadsMod.MessagePort {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("node:worker_threads", "SHARE_ENV")
  @js.native
  val SHARE_ENV: js.Symbol = js.native
  
  @JSImport("node:worker_threads", "Worker")
  @js.native
  class Worker protected ()
    extends tmttyped.node.workerThreadsMod.Worker {
    /**
      * @param filename  The path to the Worker’s main script or module.
      *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
      *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
      */
    def this(filename: java.lang.String) = this()
    def this(filename: URL) = this()
    def this(filename: java.lang.String, options: WorkerOptions) = this()
    def this(filename: URL, options: WorkerOptions) = this()
  }
  
  @JSImport("node:worker_threads", "isMainThread")
  @js.native
  val isMainThread: Boolean = js.native
  
  /**
    * Mark an object as not transferable.
    * If `object` occurs in the transfer list of a `port.postMessage()` call, it will be ignored.
    *
    * In particular, this makes sense for objects that can be cloned, rather than transferred,
    * and which are used by other objects on the sending side. For example, Node.js marks
    * the `ArrayBuffer`s it uses for its Buffer pool with this.
    *
    * This operation cannot be undone.
    */
  @JSImport("node:worker_threads", "markAsUntransferable")
  @js.native
  def markAsUntransferable(`object`: js.Object): Unit = js.native
  
  /**
    * Transfer a `MessagePort` to a different `vm` Context. The original `port`
    * object will be rendered unusable, and the returned `MessagePort` instance will
    * take its place.
    *
    * The returned `MessagePort` will be an object in the target context, and will
    * inherit from its global `Object` class. Objects passed to the
    * `port.onmessage()` listener will also be created in the target context
    * and inherit from its global `Object` class.
    *
    * However, the created `MessagePort` will no longer inherit from
    * `EventEmitter`, and only `port.onmessage()` can be used to receive
    * events using it.
    */
  @JSImport("node:worker_threads", "moveMessagePortToContext")
  @js.native
  def moveMessagePortToContext(port: tmttyped.node.workerThreadsMod.MessagePort, context: Context): tmttyped.node.workerThreadsMod.MessagePort = js.native
  
  @JSImport("node:worker_threads", "parentPort")
  @js.native
  val parentPort: Null | tmttyped.node.workerThreadsMod.MessagePort = js.native
  
  /**
    * Receive a single message from a given `MessagePort`. If no message is available,
    * `undefined` is returned, otherwise an object with a single `message` property
    * that contains the message payload, corresponding to the oldest message in the
    * `MessagePort`’s queue.
    */
  @JSImport("node:worker_threads", "receiveMessageOnPort")
  @js.native
  def receiveMessageOnPort(port: tmttyped.node.workerThreadsMod.MessagePort): js.UndefOr[Message] = js.native
  
  @JSImport("node:worker_threads", "resourceLimits")
  @js.native
  val resourceLimits: ResourceLimits_ = js.native
  
  @JSImport("node:worker_threads", "threadId")
  @js.native
  val threadId: Double = js.native
  
  @JSImport("node:worker_threads", "workerData")
  @js.native
  val workerData: js.Any = js.native
}
