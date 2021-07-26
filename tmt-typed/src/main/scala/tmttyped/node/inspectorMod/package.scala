package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspectorMod {
  
  /**
    * Deactivate the inspector. Blocks until there are no active connections.
    */
  @scala.inline
  def close(): scala.Unit = tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[scala.Unit]
  
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
  def open(): scala.Unit = tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double): scala.Unit = tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double, host: java.lang.String): scala.Unit = (tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double, host: java.lang.String, wait: scala.Boolean): scala.Unit = (tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Double, host: scala.Unit, wait: scala.Boolean): scala.Unit = (tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Unit, host: java.lang.String): scala.Unit = (tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Unit, host: java.lang.String, wait: scala.Boolean): scala.Unit = (tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(port: scala.Unit, host: scala.Unit, wait: scala.Boolean): scala.Unit = (tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  def url(): js.UndefOr[java.lang.String] = tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  /**
    * Blocks until a client (existing or connected later) has sent`Runtime.runIfWaitingForDebugger` command.
    *
    * An exception will be thrown if there is no active inspector.
    * @since v12.7.0
    */
  @scala.inline
  def waitForDebugger(): scala.Unit = tmttyped.node.inspectorMod.^.asInstanceOf[js.Dynamic].applyDynamic("waitForDebugger")().asInstanceOf[scala.Unit]
}
