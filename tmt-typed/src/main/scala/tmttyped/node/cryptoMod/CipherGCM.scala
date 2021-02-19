package tmttyped.node.cryptoMod

import tmttyped.node.Buffer
import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.anon.PlaintextLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherGCM extends Cipher {
  
  def getAuthTag(): Buffer = js.native
  
  def setAAD(buffer: ArrayBufferView): this.type = js.native
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
}
