package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.anon.DeepEqual
import tmttyped.node.nodeStrings.deepEqual
import tmttyped.node.nodeStrings.deepStrictEqual
import tmttyped.node.nodeStrings.equal
import tmttyped.node.nodeStrings.ifError
import tmttyped.node.nodeStrings.notDeepEqual
import tmttyped.node.nodeStrings.notEqual
import tmttyped.node.nodeStrings.ok
import tmttyped.node.nodeStrings.strict
import tmttyped.node.nodeStrings.strictEqual
import tmttyped.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonassertMod extends Shortcut {
  
  @JSImport("node:assert/strict", JSImport.Namespace)
  @js.native
  val ^ : (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual = js.native
  
  type _To = (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonassertMod.foo` */
  override def _to: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual = ^
}
