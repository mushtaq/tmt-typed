package tmttyped.node.cryptoMod

import tmttyped.node.anon.PlaintextLength
import tmttyped.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherGCM extends StObject {
  
  def getAuthTag(): Buffer = js.native
  
  def setAAD(buffer: js.typedarray.ArrayBufferView): this.type = js.native
  def setAAD(buffer: js.typedarray.ArrayBufferView, options: PlaintextLength): this.type = js.native
}
