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
    * The `inspector.Session` is used for dispatching messages to the V8 inspector
    * back-end and receiving message responses and notifications.
    */
  @JSImport("node:inspector", "Session")
  @js.native
  /**
    * Create a new instance of the inspector.Session class.
    * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
    */
  class Session () extends StObject
  
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  @scala.inline
  def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  /**
    * Activate inspector on host and port. Equivalent to `node --inspect=[[host:]port]`, but can be done programmatically after node has
    * started.
    *
    * If wait is `true`, will block until a client has connected to the inspect port
    * and flow control has been passed to the debugger client.
    *
    * See the `security warning` regarding the `host`parameter usage.
    * @param port Port to listen on for inspector connections. Optional.
    * @param host Host to listen on for inspector connections. Optional.
    * @param wait Block until a client has connected. Optional.
    */
  @scala.inline
  def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
  @scala.inline
  def open(port: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double, host: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double, host: java.lang.String, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Double, host: Unit, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Unit, host: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Unit, host: java.lang.String, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(port: Unit, host: Unit, wait: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Return the URL of the active inspector, or `undefined` if there is none.
    *
    * ```console
    * $ node --inspect -p 'inspector.url()'
    * Debugger listening on ws://127.0.0.1:9229/166e272e-7a30-4d09-97ce-f1c012b43c34
    * For help see https://nodejs.org/en/docs/inspector
    * ws://127.0.0.1:9229/166e272e-7a30-4d09-97ce-f1c012b43c34
    *
    * $ node --inspect=localhost:3000 -p 'inspector.url()'
    * Debugger listening on ws://localhost:3000/51cf8d0e-3c36-4c59-8efd-54519839e56a
    * For help see https://nodejs.org/en/docs/inspector
    * ws://localhost:3000/51cf8d0e-3c36-4c59-8efd-54519839e56a
    *
    * $ node -p 'inspector.url()'
    * undefined
    * ```
    */
  @scala.inline
  def url(): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  /**
    * Blocks until a client (existing or connected later) has sent`Runtime.runIfWaitingForDebugger` command.
    *
    * An exception will be thrown if there is no active inspector.
    * @since v12.7.0
    */
  @scala.inline
  def waitForDebugger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDebugger")().asInstanceOf[Unit]
}
