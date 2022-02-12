package tmttyped.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import tmttyped.node.NodeJS.Require
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
    def this(id: String) = this()
    def this(id: String, parent: Module) = this()
  }
  @JSImport("node:module", JSImport.Namespace)
  @js.native
  val ^ : js.Object with (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = js.native
  
  /* static member */
  @JSImport("node:module", "Module")
  @js.native
  def Module: Instantiable2[
    /* id */ String, 
    /* parent */ js.UndefOr[tmttyped.node.moduleMod.Module], 
    tmttyped.node.moduleMod.Module
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:module", "Module")
  @js.native
  class ModuleCls protected ()
    extends StObject
       with tmttyped.node.NodeJS.Module {
    def this(id: String) = this()
    def this(id: String, parent: Module) = this()
    
    /* CompleteClass */
    override var children: js.Array[tmttyped.node.NodeJS.Module] = js.native
    
    /* CompleteClass */
    override var exports: Any = js.native
    
    /* CompleteClass */
    override var filename: String = js.native
    
    /* CompleteClass */
    override var id: String = js.native
    
    /**
      * `true` if the module is running during the Node.js preload
      */
    /* CompleteClass */
    override var isPreloading: Boolean = js.native
    
    /* CompleteClass */
    override var loaded: Boolean = js.native
    
    /**
      * @since 11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    /* CompleteClass */
    override var path: String = js.native
    
    /* CompleteClass */
    override var paths: js.Array[String] = js.native
    
    /* CompleteClass */
    override def require(id: String): Any = js.native
    /* CompleteClass */
    @JSName("require")
    override var require_Original: Require = js.native
  }
  
  @scala.inline
  def Module_=(x: Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Module")(x.asInstanceOf[js.Any])
  
  /**
    * @since v13.7.0, v12.17.0
    */
  @JSImport("node:module", "SourceMap")
  @js.native
  class SourceMap protected ()
    extends tmttyped.node.moduleMod.SourceMap {
    def this(payload: SourceMapPayload) = this()
  }
  
  /* static member */
  @JSImport("node:module", "builtinModules")
  @js.native
  def builtinModules: js.Array[String] = js.native
  @scala.inline
  def builtinModules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinModules")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def createRequire(path: String): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  @scala.inline
  def createRequire(path: URL): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  
  /**
    * `path` is the resolved path for the file for which a corresponding source map
    * should be fetched.
    * @since v13.7.0, v12.17.0
    */
  @scala.inline
  def findSourceMap(path: String): tmttyped.node.moduleMod.SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.moduleMod.SourceMap]
  @scala.inline
  def findSourceMap(path: String, error: js.Error): tmttyped.node.moduleMod.SourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.moduleMod.SourceMap]
  
  /* static member */
  @scala.inline
  def runMain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMain")().asInstanceOf[Unit]
  
  /**
    * The `module.syncBuiltinESMExports()` method updates all the live bindings for
    * builtin `ES Modules` to match the properties of the `CommonJS` exports. It
    * does not add or remove exported names from the `ES Modules`.
    *
    * ```js
    * const fs = require('fs');
    * const assert = require('assert');
    * const { syncBuiltinESMExports } = require('module');
    *
    * fs.readFile = newAPI;
    *
    * delete fs.readFileSync;
    *
    * function newAPI() {
    *   // ...
    * }
    *
    * fs.newAPI = newAPI;
    *
    * syncBuiltinESMExports();
    *
    * import('fs').then((esmFS) => {
    *   // It syncs the existing readFile property with the new value
    *   assert.strictEqual(esmFS.readFile, newAPI);
    *   // readFileSync has been deleted from the required fs
    *   assert.strictEqual('readFileSync' in fs, false);
    *   // syncBuiltinESMExports() does not remove readFileSync from esmFS
    *   assert.strictEqual('readFileSync' in esmFS, true);
    *   // syncBuiltinESMExports() does not add names
    *   assert.strictEqual(esmFS.newAPI, undefined);
    * });
    * ```
    * @since v12.12.0
    */
  @scala.inline
  def syncBuiltinESMExports(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncBuiltinESMExports")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def wrap(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type _To = js.Object with (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module])
  
  /* This means you don't have to write `^`, but can instead just say `nodeModuleMod.foo` */
  override def _to: js.Object with (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = ^
}
