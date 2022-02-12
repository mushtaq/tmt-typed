package tmttyped.node.fsMod

import tmttyped.node.anon.StatSyncOptionsbigintbool
import tmttyped.node.anon.StatSyncOptionsbigintfals
import tmttyped.node.anon.StatSyncOptionsbigintfalsBigint
import tmttyped.node.anon.StatSyncOptionsbiginttrue
import tmttyped.node.anon.StatSyncOptionsbiginttrueBigint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatSyncFn
  extends js.Function {
  
  def apply(path: PathLike): Stats = js.native
  def apply(path: PathLike, options: Unit): Stats = js.native
  def apply(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
  def apply(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
  def apply(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
  def apply(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
  def apply(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
  def apply(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
}
