package tmttyped.rsocketCore

import tmttyped.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketbufferutilsMod {
  
  @JSImport("rsocket-core/RSocketBufferUtils", "byteLength")
  @js.native
  def byteLength(data: js.Any, encoding: Encoding): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "createBuffer")
  @js.native
  def createBuffer(args: js.Any*): Buffer = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "readUInt24BE")
  @js.native
  def readUInt24BE(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "readUInt64BE")
  @js.native
  def readUInt64BE(buffer: Buffer, offset: Double): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "toBuffer")
  @js.native
  def toBuffer(data: js.Any): Buffer = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "writeUInt24BE")
  @js.native
  def writeUInt24BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  
  @JSImport("rsocket-core/RSocketBufferUtils", "writeUInt64BE")
  @js.native
  def writeUInt64BE(buffer: Buffer, value: Double, offset: Double): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.rsocketCore.rsocketCoreStrings.ascii
    - tmttyped.rsocketCore.rsocketCoreStrings.base64
    - tmttyped.rsocketCore.rsocketCoreStrings.hex
    - tmttyped.rsocketCore.rsocketCoreStrings.utf8
  */
  trait Encoding extends StObject
  object Encoding {
    
    @scala.inline
    def ascii: tmttyped.rsocketCore.rsocketCoreStrings.ascii = "ascii".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.ascii]
    
    @scala.inline
    def base64: tmttyped.rsocketCore.rsocketCoreStrings.base64 = "base64".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.base64]
    
    @scala.inline
    def hex: tmttyped.rsocketCore.rsocketCoreStrings.hex = "hex".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.hex]
    
    @scala.inline
    def utf8: tmttyped.rsocketCore.rsocketCoreStrings.utf8 = "utf8".asInstanceOf[tmttyped.rsocketCore.rsocketCoreStrings.utf8]
  }
}
