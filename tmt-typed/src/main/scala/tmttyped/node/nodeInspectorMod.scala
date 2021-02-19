package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeInspectorMod {
  
  /**
    * The inspector.Session is used for dispatching messages to the V8 inspector back-end and receiving message responses and notifications.
    */
  @JSImport("node:inspector", "Session")
  @js.native
  /**
    * Create a new instance of the inspector.Session class.
    * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
    */
  class Session ()
    extends tmttyped.node.inspectorMod.Session
  
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  @JSImport("node:inspector", "close")
  @js.native
  def close(): Unit = js.native
  
  // Top Level API
  /**
    * Activate inspector on host and port. Equivalent to node --inspect=[[host:]port], but can be done programatically after node has started.
    * If wait is true, will block until a client has connected to the inspect port and flow control has been passed to the debugger client.
    * @param port Port to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param host Host to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param wait Block until a client has connected. Optional, defaults to false.
    */
  @JSImport("node:inspector", "open")
  @js.native
  def open(): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], wait: Boolean): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: js.UndefOr[scala.Nothing], host: java.lang.String): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: js.UndefOr[scala.Nothing], host: java.lang.String, wait: Boolean): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: Double): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: Double, host: js.UndefOr[scala.Nothing], wait: Boolean): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: Double, host: java.lang.String): Unit = js.native
  @JSImport("node:inspector", "open")
  @js.native
  def open(port: Double, host: java.lang.String, wait: Boolean): Unit = js.native
  
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    */
  @JSImport("node:inspector", "url")
  @js.native
  def url(): js.UndefOr[java.lang.String] = js.native
  
  /**
    * Blocks until a client (existing or connected later) has sent
    * `Runtime.runIfWaitingForDebugger` command.
    * An exception will be thrown if there is no active inspector.
    */
  @JSImport("node:inspector", "waitForDebugger")
  @js.native
  def waitForDebugger(): Unit = js.native
}
