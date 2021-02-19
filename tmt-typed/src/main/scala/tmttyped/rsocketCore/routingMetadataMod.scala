package tmttyped.rsocketCore

import tmttyped.node.Buffer
import tmttyped.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routingMetadataMod {
  
  @JSImport("rsocket-core/RoutingMetadata", "RoutingMetadata")
  @js.native
  class RoutingMetadata protected () extends Iterable[String] {
    def this(buffer: Buffer) = this()
  }
  
  @JSImport("rsocket-core/RoutingMetadata", "decodeRoutes")
  @js.native
  def decodeRoutes(routeMetadataBuffer: Buffer): js.Iterator[String] = js.native
  
  @JSImport("rsocket-core/RoutingMetadata", "encodeRoute")
  @js.native
  def encodeRoute(route: String): Buffer = js.native
  
  @JSImport("rsocket-core/RoutingMetadata", "encodeRoutes")
  @js.native
  def encodeRoutes(routes: String*): Buffer = js.native
}
