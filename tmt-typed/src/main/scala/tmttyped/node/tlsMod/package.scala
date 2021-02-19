package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tlsMod {
  
  @scala.inline
  def CLIENT_RENEG_LIMIT: scala.Double = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_LIMIT").asInstanceOf[scala.Double]
  
  @scala.inline
  def CLIENT_RENEG_WINDOW: scala.Double = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_WINDOW").asInstanceOf[scala.Double]
  
  /**
    * The default curve name to use for ECDH key agreement in a tls server.
    * The default value is 'auto'. See tls.createSecureContext() for further
    * information.
    */
  @scala.inline
  def DEFAULT_ECDH_CURVE: java.lang.String = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ECDH_CURVE").asInstanceOf[java.lang.String]
  @scala.inline
  def DEFAULT_ECDH_CURVE_=(x: java.lang.String): scala.Unit = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ECDH_CURVE")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the maxVersion option of
    * tls.createSecureContext(). It can be assigned any of the supported TLS
    * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
    * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
    * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
    * is used.
    */
  @scala.inline
  def DEFAULT_MAX_VERSION: tmttyped.node.tlsMod.SecureVersion = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MAX_VERSION").asInstanceOf[tmttyped.node.tlsMod.SecureVersion]
  @scala.inline
  def DEFAULT_MAX_VERSION_=(x: tmttyped.node.tlsMod.SecureVersion): scala.Unit = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * The default value of the minVersion option of tls.createSecureContext().
    * It can be assigned any of the supported TLS protocol versions,
    * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
    * changed using CLI options. Using --tls-min-v1.0 sets the default to
    * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
    * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
    * are provided, the lowest minimum is used.
    */
  @scala.inline
  def DEFAULT_MIN_VERSION: tmttyped.node.tlsMod.SecureVersion = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MIN_VERSION").asInstanceOf[tmttyped.node.tlsMod.SecureVersion]
  @scala.inline
  def DEFAULT_MIN_VERSION_=(x: tmttyped.node.tlsMod.SecureVersion): scala.Unit = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_VERSION")(x.asInstanceOf[js.Any])
  
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  @scala.inline
  def checkServerIdentity(host: java.lang.String, cert: tmttyped.node.tlsMod.PeerCertificate): js.UndefOr[js.Error] = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkServerIdentity")(host.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
  
  @scala.inline
  def connect(options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(options: tmttyped.node.tlsMod.ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double): tmttyped.node.tlsMod.TLSSocket = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: js.UndefOr[scala.Nothing],
    options: tmttyped.node.tlsMod.ConnectionOptions
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: js.UndefOr[scala.Nothing],
    options: tmttyped.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: java.lang.String): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, host: java.lang.String, options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    host: java.lang.String,
    options: tmttyped.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(port: scala.Double, options: tmttyped.node.tlsMod.ConnectionOptions): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  @scala.inline
  def connect(
    port: scala.Double,
    options: tmttyped.node.tlsMod.ConnectionOptions,
    secureConnectListener: js.Function0[scala.Unit]
  ): tmttyped.node.tlsMod.TLSSocket = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.TLSSocket]
  
  @scala.inline
  def createSecureContext(): tmttyped.node.tlsMod.SecureContext = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")().asInstanceOf[tmttyped.node.tlsMod.SecureContext]
  @scala.inline
  def createSecureContext(options: tmttyped.node.tlsMod.SecureContextOptions): tmttyped.node.tlsMod.SecureContext = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.SecureContext]
  
  /**
    * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
    */
  @scala.inline
  def createSecurePair(): tmttyped.node.tlsMod.SecurePair = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: scala.Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: js.UndefOr[scala.Nothing], isServer: scala.Boolean, requestCert: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: js.UndefOr[scala.Nothing],
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: tmttyped.node.tlsMod.SecureContext): tmttyped.node.tlsMod.SecurePair = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: tmttyped.node.tlsMod.SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: tmttyped.node.tlsMod.SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: tmttyped.node.tlsMod.SecureContext,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(credentials: tmttyped.node.tlsMod.SecureContext, isServer: scala.Boolean): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  @scala.inline
  def createSecurePair(
    credentials: tmttyped.node.tlsMod.SecureContext,
    isServer: scala.Boolean,
    requestCert: scala.Boolean,
    rejectUnauthorized: scala.Boolean
  ): tmttyped.node.tlsMod.SecurePair = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.SecurePair]
  
  @scala.inline
  def createServer(): tmttyped.node.tlsMod.Server = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(options: tmttyped.node.tlsMod.TlsOptions): tmttyped.node.tlsMod.Server = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(
    options: tmttyped.node.tlsMod.TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, scala.Unit]
  ): tmttyped.node.tlsMod.Server = (tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.tlsMod.Server]
  @scala.inline
  def createServer(secureConnectionListener: js.Function1[/* socket */ tmttyped.node.tlsMod.TLSSocket, scala.Unit]): tmttyped.node.tlsMod.Server = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(secureConnectionListener.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.tlsMod.Server]
  
  @scala.inline
  def getCiphers(): js.Array[java.lang.String] = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]
  
  /**
    * An immutable array of strings representing the root certificates (in PEM
    * format) used for verifying peer certificates. This is the default value
    * of the ca option to tls.createSecureContext().
    */
  @scala.inline
  def rootCertificates: js.Array[java.lang.String] = tmttyped.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("rootCertificates").asInstanceOf[js.Array[java.lang.String]]
}
