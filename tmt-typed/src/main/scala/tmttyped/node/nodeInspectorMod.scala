package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeInspectorMod {
  
  @JSImport("node:inspector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  // Top Level API
  /**
    * Activate inspector on host and port. Equivalent to node --inspect=[[host:]port], but can be done programatically after node has started.
    * If wait is true, will block until a client has connected to the inspect port and flow control has been passed to the debugger client.
    * @param port Port to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param host Host to listen on for inspector connections. Optional, defaults to what was specified on the CLI.
    * @param wait Block until a client has connected. Optional, defaults to false.
    */
  @scala.inline
  def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
  @scala.inline
  def open(port: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: js.UndefOr[scala.Nothing], host: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: js.UndefOr[scala.Nothing], host: java.lang.String, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double, host: js.UndefOr[scala.Nothing], wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double, host: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double, host: java.lang.String, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    */
  @scala.inline
  def url(): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  /**
    * Blocks until a client (existing or connected later) has sent
    * `Runtime.runIfWaitingForDebugger` command.
    * An exception will be thrown if there is no active inspector.
    */
  @scala.inline
  def waitForDebugger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDebugger")().asInstanceOf[Unit]
}
