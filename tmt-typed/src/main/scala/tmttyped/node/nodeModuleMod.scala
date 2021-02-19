package tmttyped.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import tmttyped.node.moduleMod.Module
import tmttyped.node.moduleMod.SourceMapPayload
import tmttyped.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeModuleMod extends Shortcut {
  
  @JSImport("node:module", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends tmttyped.node.moduleMod.^ {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
  }
  @JSImport("node:module", JSImport.Namespace)
  @js.native
  val ^ : Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = js.native
  
  /* static member */
  @JSImport("node:module", "Module")
  @js.native
  def Module: Instantiable2[
    /* id */ java.lang.String, 
    /* parent */ js.UndefOr[tmttyped.node.moduleMod.Module], 
    tmttyped.node.moduleMod.Module
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:module", "Module")
  @js.native
  class ModuleCls protected ()
    extends tmttyped.node.NodeJS.Module {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
  }
  
  @scala.inline
  def Module_=(x: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Module")(x.asInstanceOf[js.Any])
  
  @JSImport("node:module", "SourceMap")
  @js.native
  class SourceMap protected ()
    extends tmttyped.node.moduleMod.SourceMap {
    def this(payload: SourceMapPayload) = this()
  }
  
  /* static member */
  @JSImport("node:module", "builtinModules")
  @js.native
  def builtinModules: js.Array[java.lang.String] = js.native
  @scala.inline
  def builtinModules_=(x: js.Array[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinModules")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node:module", "createRequire")
  @js.native
  def createRequire(path: java.lang.String): NodeRequire = js.native
  @JSImport("node:module", "createRequire")
  @js.native
  def createRequire(path: URL): NodeRequire = js.native
  
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  /* static member */
  @JSImport("node:module", "createRequireFromPath")
  @js.native
  def createRequireFromPath(path: java.lang.String): NodeRequire = js.native
  
  @JSImport("node:module", "findSourceMap")
  @js.native
  def findSourceMap(path: java.lang.String): tmttyped.node.moduleMod.SourceMap = js.native
  @JSImport("node:module", "findSourceMap")
  @js.native
  def findSourceMap(path: java.lang.String, error: js.Error): tmttyped.node.moduleMod.SourceMap = js.native
  
  /* static member */
  @JSImport("node:module", "runMain")
  @js.native
  def runMain(): Unit = js.native
  
  /**
    * Updates all the live bindings for builtin ES Modules to match the properties of the CommonJS exports.
    * It does not add or remove exported names from the ES Modules.
    */
  @JSImport("node:module", "syncBuiltinESMExports")
  @js.native
  def syncBuiltinESMExports(): Unit = js.native
  
  /* static member */
  @JSImport("node:module", "wrap")
  @js.native
  def wrap(code: java.lang.String): java.lang.String = js.native
  
  type _To = Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module]
  
  /* This means you don't have to write `^`, but can instead just say `nodeModuleMod.foo` */
  override def _to: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = ^
}
