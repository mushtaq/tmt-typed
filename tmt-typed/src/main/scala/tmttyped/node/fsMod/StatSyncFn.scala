package tmttyped.node.fsMod

import tmttyped.node.anon.StatOptionsbigintbooleant
import tmttyped.node.anon.StatOptionsbigintfalseund
import tmttyped.node.anon.StatOptionsbigintfalseundBigint
import tmttyped.node.anon.StatOptionsbiginttrue
import tmttyped.node.anon.StatOptionsbiginttruethro
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatSyncFn[TDescriptor]
  extends js.Function {
  
  def apply(path: TDescriptor): Stats = js.native
  def apply(path: TDescriptor, options: Unit): Stats = js.native
  def apply(path: TDescriptor, options: StatOptionsbigintbooleant): Stats | BigIntStats = js.native
  def apply(path: TDescriptor, options: StatOptionsbigintfalseund): Stats = js.native
  def apply(path: TDescriptor, options: StatOptionsbigintfalseundBigint): js.UndefOr[Stats] = js.native
  def apply(path: TDescriptor, options: StatOptionsbiginttrue): BigIntStats = js.native
  def apply(path: TDescriptor, options: StatOptionsbiginttruethro): js.UndefOr[BigIntStats] = js.native
  def apply(path: TDescriptor, options: StatOptions): js.UndefOr[Stats | BigIntStats] = js.native
}
