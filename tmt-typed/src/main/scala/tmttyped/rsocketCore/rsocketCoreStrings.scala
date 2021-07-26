package tmttyped.rsocketCore

import tmttyped.rsocketCore.rsocketbufferutilsMod.Encoding
import tmttyped.rsocketCore.rsocketleaseMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketCoreStrings {
  
  @js.native
  sealed trait Accept
    extends StObject
       with EventType
  @scala.inline
  def Accept: Accept = "Accept".asInstanceOf[Accept]
  
  @js.native
  sealed trait Reject
    extends StObject
       with EventType
  @scala.inline
  def Reject: Reject = "Reject".asInstanceOf[Reject]
  
  @js.native
  sealed trait Terminate
    extends StObject
       with EventType
  @scala.inline
  def Terminate: Terminate = "Terminate".asInstanceOf[Terminate]
  
  @js.native
  sealed trait ascii
    extends StObject
       with Encoding
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64
    extends StObject
       with Encoding
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait hex
    extends StObject
       with Encoding
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait utf8
    extends StObject
       with Encoding
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
