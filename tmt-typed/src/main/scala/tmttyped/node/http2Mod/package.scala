package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object http2Mod {
  
  @scala.inline
  def connect(authority: java.lang.String): tmttyped.node.http2Mod.ClientHttp2Session = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: java.lang.String, options: tmttyped.node.http2Mod.ClientSessionOptions): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    options: tmttyped.node.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: java.lang.String, options: tmttyped.node.http2Mod.SecureClientSessionOptions): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: java.lang.String,
    options: tmttyped.node.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: tmttyped.node.nodeUrlMod.URL): tmttyped.node.http2Mod.ClientHttp2Session = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: tmttyped.node.nodeUrlMod.URL,
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: tmttyped.node.nodeUrlMod.URL,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(authority: tmttyped.node.nodeUrlMod.URL, options: tmttyped.node.http2Mod.ClientSessionOptions): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: tmttyped.node.nodeUrlMod.URL,
    options: tmttyped.node.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: tmttyped.node.nodeUrlMod.URL,
    options: tmttyped.node.http2Mod.SecureClientSessionOptions
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  @scala.inline
  def connect(
    authority: tmttyped.node.nodeUrlMod.URL,
    options: tmttyped.node.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ tmttyped.node.http2Mod.ClientHttp2Session, 
      /* socket */ tmttyped.node.nodeNetMod.Socket | tmttyped.node.nodeTlsMod.TLSSocket, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.ClientHttp2Session = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(authority.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.ClientHttp2Session]
  
  @scala.inline
  def createSecureServer(): tmttyped.node.http2Mod.Http2SecureServer = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")().asInstanceOf[tmttyped.node.http2Mod.Http2SecureServer]
  @scala.inline
  def createSecureServer(
    onRequestHandler: js.Function2[
      /* request */ tmttyped.node.http2Mod.Http2ServerRequest, 
      /* response */ tmttyped.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.Http2SecureServer = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.Http2SecureServer]
  @scala.inline
  def createSecureServer(options: tmttyped.node.http2Mod.SecureServerOptions): tmttyped.node.http2Mod.Http2SecureServer = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.Http2SecureServer]
  @scala.inline
  def createSecureServer(
    options: tmttyped.node.http2Mod.SecureServerOptions,
    onRequestHandler: js.Function2[
      /* request */ tmttyped.node.http2Mod.Http2ServerRequest, 
      /* response */ tmttyped.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.Http2SecureServer = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.Http2SecureServer]
  
  @scala.inline
  def createServer(): tmttyped.node.http2Mod.Http2Server = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[tmttyped.node.http2Mod.Http2Server]
  @scala.inline
  def createServer(
    onRequestHandler: js.Function2[
      /* request */ tmttyped.node.http2Mod.Http2ServerRequest, 
      /* response */ tmttyped.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.Http2Server = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(onRequestHandler.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.Http2Server]
  @scala.inline
  def createServer(options: tmttyped.node.http2Mod.ServerOptions): tmttyped.node.http2Mod.Http2Server = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.Http2Server]
  @scala.inline
  def createServer(
    options: tmttyped.node.http2Mod.ServerOptions,
    onRequestHandler: js.Function2[
      /* request */ tmttyped.node.http2Mod.Http2ServerRequest, 
      /* response */ tmttyped.node.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): tmttyped.node.http2Mod.Http2Server = (tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], onRequestHandler.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.http2Mod.Http2Server]
  
  @scala.inline
  def getDefaultSettings(): tmttyped.node.http2Mod.Settings = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSettings")().asInstanceOf[tmttyped.node.http2Mod.Settings]
  
  @scala.inline
  def getPackedSettings(settings: tmttyped.node.http2Mod.Settings): tmttyped.node.Buffer = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPackedSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def getUnpackedSettings(buf: js.typedarray.Uint8Array): tmttyped.node.http2Mod.Settings = tmttyped.node.http2Mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedSettings")(buf.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.http2Mod.Settings]
  
  type ServerOptions = tmttyped.node.http2Mod.ServerSessionOptions
}
