package tmttyped.node

import tmttyped.node.nodeNetMod.Socket
import tmttyped.node.tlsMod.ConnectionOptions
import tmttyped.node.tlsMod.PeerCertificate
import tmttyped.node.tlsMod.SecureContext
import tmttyped.node.tlsMod.SecureContextOptions
import tmttyped.node.tlsMod.SecurePair
import tmttyped.node.tlsMod.SecureVersion
import tmttyped.node.tlsMod.TLSSocketOptions
import tmttyped.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTlsMod {
  
  @JSImport("node:tls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:tls", "CLIENT_RENEG_LIMIT")
  @js.native
  val CLIENT_RENEG_LIMIT: Double = js.native
  
  @JSImport("node:tls", "CLIENT_RENEG_WINDOW")
  @js.native
  val CLIENT_RENEG_WINDOW: Double = js.native
  
  /**
    * The default curve name to use for ECDH key agreement in a tls server.
    * The default value is 'auto'. See tls.createSecureContext() for further
    * information.
    */
  @JSImport("node:tls", "DEFAULT_ECDH_CURVE")
  @js.native
  def DEFAULT_ECDH_CURVE: java.lang.String = js.native
  @scala.inline
  def DEFAULT_ECDH_CURVE_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ECDH_CURVE")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the maxVersion option of
    * tls.createSecureContext(). It can be assigned any of the supported TLS
    * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
    * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
    * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
    * is used.
    */
  @JSImport("node:tls", "DEFAULT_MAX_VERSION")
  @js.native
  def DEFAULT_MAX_VERSION: SecureVersion = js.native
  @scala.inline
  def DEFAULT_MAX_VERSION_=(x: SecureVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the minVersion option of tls.createSecureContext().
    * It can be assigned any of the supported TLS protocol versions,
    * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
    * changed using CLI options. Using --tls-min-v1.0 sets the default to
    * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
    * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
    * are provided, the lowest minimum is used.
    */
  @JSImport("node:tls", "DEFAULT_MIN_VERSION")
  @js.native
  def DEFAULT_MIN_VERSION: SecureVersion = js.native
  @scala.inline
  def DEFAULT_MIN_VERSION_=(x: SecureVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_VERSION")(x.asInstanceOf[js.Any])
  
  @JSImport("node:tls", "Server")
  @js.native
  class Server ()
    extends tmttyped.node.tlsMod.Server {
    def this(options: TlsOptions) = this()
    def this(secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]) = this()
    def this(
      options: TlsOptions,
      secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]
    ) = this()
  }
  
  @JSImport("node:tls", "TLSSocket")
  @js.native
  class TLSSocket protected ()
    extends tmttyped.node.tlsMod.TLSSocket {
    /**
      * Construct a new tls.TLSSocket object from an existing TCP socket.
      */
    def this(socket: Socket) = this()
    def this(socket: Socket, options: TLSSocketOptions) = this()
  }
  
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  @scala.inline
  def checkServerIdentity(host: java.lang.String, cert: PeerCertificate): js.UndefOr[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkServerIdentity")(host.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
  
  @scala.inline
  def connect(options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double): tmttyped.node.tlsMod.TLSSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: js.UndefOr[scala.Nothing], options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: java.lang.String): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: Double,
    host: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, host: java.lang.String, options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: Double,
    host: java.lang.String,
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, options: js.UndefOr[scala.Nothing], secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, options: ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): tmttyped.node.tlsMod.TLSSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  
  @scala.inline
  def createSecureContext(): SecureContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")().asInstanceOf[SecureContext]
  @scala.inline
  def createSecureContext(options: SecureContextOptions): SecureContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(options.asInstanceOf[js.Any]).asInstanceOf[SecureContext]
  
  /**
    * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
    */
  @scala.inline
  def createSecurePair(): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: SecureContext): SecurePair = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any]).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: SecureContext, isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: SecureContext, isServer: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: SecureContext,
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  @scala.inline
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[SecurePair]
  
  @scala.inline
  def createServer(): tmttyped.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(options: TlsOptions): tmttyped.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]
  ): tmttyped.node.tlsMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, Unit]): tmttyped.node.tlsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(secureConnectionListener.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * An immutable array of strings representing the root certificates (in PEM
    * format) used for verifying peer certificates. This is the default value
    * of the ca option to tls.createSecureContext().
    */
  @JSImport("node:tls", "rootCertificates")
  @js.native
  val rootCertificates: js.Array[java.lang.String] = js.native
}
