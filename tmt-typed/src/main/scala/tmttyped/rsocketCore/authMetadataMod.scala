package tmttyped.rsocketCore

import tmttyped.node.Buffer
import tmttyped.rsocketCore.wellKnownAuthTypeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMetadataMod {
  
  @JSImport("rsocket-core/AuthMetadata", "decodeAuthMetadata")
  @js.native
  def decodeAuthMetadata(metadata: Buffer): AuthMetadata = js.native
  
  @JSImport("rsocket-core/AuthMetadata", "decodeSimpleAuthPayload")
  @js.native
  def decodeSimpleAuthPayload(authPayload: Buffer): UsernameAndPassword = js.native
  
  @JSImport("rsocket-core/AuthMetadata", "encodeBearerAuthMetadata")
  @js.native
  def encodeBearerAuthMetadata(token: String): Buffer = js.native
  @JSImport("rsocket-core/AuthMetadata", "encodeBearerAuthMetadata")
  @js.native
  def encodeBearerAuthMetadata(token: Buffer): Buffer = js.native
  
  @JSImport("rsocket-core/AuthMetadata", "encodeCustomAuthMetadata")
  @js.native
  def encodeCustomAuthMetadata(customAuthType: String, authPayloadBuffer: Buffer): Buffer = js.native
  
  @JSImport("rsocket-core/AuthMetadata", "encodeSimpleAuthMetadata")
  @js.native
  def encodeSimpleAuthMetadata(username: String, password: String): Buffer = js.native
  @JSImport("rsocket-core/AuthMetadata", "encodeSimpleAuthMetadata")
  @js.native
  def encodeSimpleAuthMetadata(username: String, password: Buffer): Buffer = js.native
  @JSImport("rsocket-core/AuthMetadata", "encodeSimpleAuthMetadata")
  @js.native
  def encodeSimpleAuthMetadata(username: Buffer, password: String): Buffer = js.native
  @JSImport("rsocket-core/AuthMetadata", "encodeSimpleAuthMetadata")
  @js.native
  def encodeSimpleAuthMetadata(username: Buffer, password: Buffer): Buffer = js.native
  
  @JSImport("rsocket-core/AuthMetadata", "encodeWellKnownAuthMetadata")
  @js.native
  def encodeWellKnownAuthMetadata(authType: default, authPayloadBuffer: Buffer): Buffer = js.native
  
  trait AuthMetadata extends StObject {
    
    var payload: Buffer
    
    var `type`: Type
  }
  object AuthMetadata {
    
    @scala.inline
    def apply(payload: Buffer, `type`: Type): AuthMetadata = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthMetadata]
    }
    
    @scala.inline
    implicit class AuthMetadataMutableBuilder[Self <: AuthMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var identifier: Double
    
    var string: String
  }
  object Type {
    
    @scala.inline
    def apply(identifier: Double, string: String): Type = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsernameAndPassword extends StObject {
    
    var password: Buffer
    
    var username: Buffer
  }
  object UsernameAndPassword {
    
    @scala.inline
    def apply(password: Buffer, username: Buffer): UsernameAndPassword = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsernameAndPassword]
    }
    
    @scala.inline
    implicit class UsernameAndPasswordMutableBuilder[Self <: UsernameAndPassword] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: Buffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: Buffer): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
