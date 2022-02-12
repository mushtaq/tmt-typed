package tmttyped.node

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import tmttyped.node.NodeJS.Require
import tmttyped.node.nodeUrlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod extends Shortcut {
  
  @JSImport("module", JSImport.Namespace)
  @js.native
  class ^ protected ()
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
  @JSImport("module", JSImport.Namespace)
  @js.native
  val ^ : js.Object with (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = js.native
  
  /* static member */
  @JSImport("module", "Module")
  @js.native
  def Module: Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module] = js.native
  type Module = NodeModule
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("module", "Module")
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
  @JSImport("module", "SourceMap")
  @js.native
  class SourceMap protected () extends StObject {
    def this(payload: SourceMapPayload) = this()
    
    /**
      * Given a line number and column number in the generated source file, returns
      * an object representing the position in the original file. The object returned
      * consists of the following keys:
      */
    def findEntry(line: Double, column: Double): SourceMapping = js.native
    
    /**
      * Getter for the payload used to construct the `SourceMap` instance.
      */
    val payload: SourceMapPayload = js.native
  }
  
  /* static member */
  @JSImport("module", "builtinModules")
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
  def findSourceMap(path: String): SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any]).asInstanceOf[SourceMap]
  @scala.inline
  def findSourceMap(path: String, error: js.Error): SourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[SourceMap]
  
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
  
  trait SourceMapPayload extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: String
    
    var sources: js.Array[String]
    
    var sourcesContent: js.Array[String]
    
    var version: Double
  }
  object SourceMapPayload {
    
    @scala.inline
    def apply(
      file: String,
      mappings: String,
      names: js.Array[String],
      sourceRoot: String,
      sources: js.Array[String],
      sourcesContent: js.Array[String],
      version: Double
    ): SourceMapPayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapPayload]
    }
    
    @scala.inline
    implicit class SourceMapPayloadMutableBuilder[Self <: SourceMapPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapping extends StObject {
    
    var generatedColumn: Double
    
    var generatedLine: Double
    
    var originalColumn: Double
    
    var originalLine: Double
    
    var originalSource: String
  }
  object SourceMapping {
    
    @scala.inline
    def apply(
      generatedColumn: Double,
      generatedLine: Double,
      originalColumn: Double,
      originalLine: Double,
      originalSource: String
    ): SourceMapping = {
      val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapping]
    }
    
    @scala.inline
    implicit class SourceMappingMutableBuilder[Self <: SourceMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeneratedColumn(value: Double): Self = StObject.set(x, "generatedColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratedLine(value: Double): Self = StObject.set(x, "generatedLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalColumn(value: Double): Self = StObject.set(x, "originalColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalLine(value: Double): Self = StObject.set(x, "originalLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalSource(value: String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object with (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module])
  
  /* This means you don't have to write `^`, but can instead just say `moduleMod.foo` */
  override def _to: js.Object with (Instantiable2[/* id */ String, /* parent */ js.UndefOr[Module], Module]) = ^
  
  object global {
    
    trait ImportMeta extends StObject {
      
      /**
        * @experimental
        * This feature is only available with the `--experimental-import-meta-resolve`
        * command flag enabled.
        *
        * Provides a module-relative resolution function scoped to each module, returning
        * the URL string.
        *
        * @param specified The module specifier to resolve relative to `parent`.
        * @param parent The absolute parent module URL to resolve from. If none
        * is specified, the value of `import.meta.url` is used as the default.
        */
      var resolve: js.UndefOr[
            js.Function2[
              /* specified */ String, 
              /* parent */ js.UndefOr[String | org.scalajs.dom.URL], 
              js.Promise[String]
            ]
          ] = js.undefined
      
      var url: String
    }
    object ImportMeta {
      
      @scala.inline
      def apply(url: String): ImportMeta = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ImportMeta]
      }
      
      @scala.inline
      implicit class ImportMetaMutableBuilder[Self <: ImportMeta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setResolve(
          value: (/* specified */ String, /* parent */ js.UndefOr[String | org.scalajs.dom.URL]) => js.Promise[String]
        ): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
        
        @scala.inline
        def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
