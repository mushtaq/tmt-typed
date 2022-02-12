package tmttyped.rsocketCore

import tmttyped.node.bufferMod.global.Buffer
import tmttyped.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routingMetadataMod {
  
  @JSImport("rsocket-core/RoutingMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rsocket-core/RoutingMetadata", "RoutingMetadata")
  @js.native
  class RoutingMetadata protected ()
    extends StObject
       with Iterable[String] {
    def this(buffer: Buffer) = this()
  }
  
  @scala.inline
  def decodeRoutes(routeMetadataBuffer: Buffer): js.Iterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRoutes")(routeMetadataBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[String]]
  
  @scala.inline
  def encodeRoute(route: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRoute")(route.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def encodeRoutes(routes: String*): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeRoutes")(routes.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Buffer]
}
