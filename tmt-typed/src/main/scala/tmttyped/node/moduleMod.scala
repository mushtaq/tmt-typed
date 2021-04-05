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
    extends tmttyped.node.NodeJS.Module {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
    
    /* CompleteClass */
    override var children: js.Array[tmttyped.node.NodeJS.Module] = js.native
    
    /* CompleteClass */
    override var exports: js.Any = js.native
    
    /* CompleteClass */
    override var filename: java.lang.String = js.native
    
    /* CompleteClass */
    override var id: java.lang.String = js.native
    
    /* CompleteClass */
    override var loaded: Boolean = js.native
    
    /**
      * @since 11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    /* CompleteClass */
    override var path: java.lang.String = js.native
    
    /* CompleteClass */
    override var paths: js.Array[java.lang.String] = js.native
    
    /* CompleteClass */
    override def require(id: java.lang.String): js.Any = js.native
    /* CompleteClass */
    @JSName("require")
    override var require_Original: Require = js.native
  }
  @JSImport("module", JSImport.Namespace)
  @js.native
  val ^ : Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = js.native
  
  /* static member */
  @JSImport("module", "Module")
  @js.native
  def Module: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = js.native
  type Module = NodeModule
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("module", "Module")
  @js.native
  class ModuleCls protected ()
    extends tmttyped.node.NodeJS.Module {
    def this(id: java.lang.String) = this()
    def this(id: java.lang.String, parent: Module) = this()
    
    /* CompleteClass */
    override var children: js.Array[tmttyped.node.NodeJS.Module] = js.native
    
    /* CompleteClass */
    override var exports: js.Any = js.native
    
    /* CompleteClass */
    override var filename: java.lang.String = js.native
    
    /* CompleteClass */
    override var id: java.lang.String = js.native
    
    /* CompleteClass */
    override var loaded: Boolean = js.native
    
    /**
      * @since 11.14.0
      *
      * The directory name of the module. This is usually the same as the path.dirname() of the module.id.
      */
    /* CompleteClass */
    override var path: java.lang.String = js.native
    
    /* CompleteClass */
    override var paths: js.Array[java.lang.String] = js.native
    
    /* CompleteClass */
    override def require(id: java.lang.String): js.Any = js.native
    /* CompleteClass */
    @JSName("require")
    override var require_Original: Require = js.native
  }
  
  @scala.inline
  def Module_=(x: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Module")(x.asInstanceOf[js.Any])
  
  @JSImport("module", "SourceMap")
  @js.native
  class SourceMap protected () extends StObject {
    def this(payload: SourceMapPayload) = this()
    
    def findEntry(line: Double, column: Double): SourceMapping = js.native
    
    val payload: SourceMapPayload = js.native
  }
  
  /* static member */
  @JSImport("module", "builtinModules")
  @js.native
  def builtinModules: js.Array[java.lang.String] = js.native
  @scala.inline
  def builtinModules_=(x: js.Array[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("builtinModules")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def createRequire(path: java.lang.String): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  @scala.inline
  def createRequire(path: URL): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequire")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  
  /**
    * @deprecated Deprecated since: v12.2.0. Please use createRequire() instead.
    */
  /* static member */
  @scala.inline
  def createRequireFromPath(path: java.lang.String): NodeRequire = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequireFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[NodeRequire]
  
  @scala.inline
  def findSourceMap(path: java.lang.String): SourceMap = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any]).asInstanceOf[SourceMap]
  @scala.inline
  def findSourceMap(path: java.lang.String, error: js.Error): SourceMap = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourceMap")(path.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[SourceMap]
  
  /* static member */
  @scala.inline
  def runMain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runMain")().asInstanceOf[Unit]
  
  /**
    * Updates all the live bindings for builtin ES Modules to match the properties of the CommonJS exports.
    * It does not add or remove exported names from the ES Modules.
    */
  @scala.inline
  def syncBuiltinESMExports(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncBuiltinESMExports")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def wrap(code: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(code.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  trait SourceMapPayload extends StObject {
    
    var file: java.lang.String
    
    var mappings: java.lang.String
    
    var names: js.Array[java.lang.String]
    
    var sourceRoot: java.lang.String
    
    var sources: js.Array[java.lang.String]
    
    var sourcesContent: js.Array[java.lang.String]
    
    var version: Double
  }
  object SourceMapPayload {
    
    @scala.inline
    def apply(
      file: java.lang.String,
      mappings: java.lang.String,
      names: js.Array[java.lang.String],
      sourceRoot: java.lang.String,
      sources: js.Array[java.lang.String],
      sourcesContent: js.Array[java.lang.String],
      version: Double
    ): SourceMapPayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapPayload]
    }
    
    @scala.inline
    implicit class SourceMapPayloadMutableBuilder[Self <: SourceMapPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: java.lang.String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappings(value: java.lang.String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[java.lang.String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: java.lang.String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSourceRoot(value: java.lang.String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[java.lang.String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[java.lang.String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentVarargs(value: java.lang.String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: java.lang.String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceMapping extends StObject {
    
    var generatedColumn: Double
    
    var generatedLine: Double
    
    var originalColumn: Double
    
    var originalLine: Double
    
    var originalSource: java.lang.String
  }
  object SourceMapping {
    
    @scala.inline
    def apply(
      generatedColumn: Double,
      generatedLine: Double,
      originalColumn: Double,
      originalLine: Double,
      originalSource: java.lang.String
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
      def setOriginalSource(value: java.lang.String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module]
  
  /* This means you don't have to write `^`, but can instead just say `moduleMod.foo` */
  override def _to: Instantiable2[/* id */ java.lang.String, /* parent */ js.UndefOr[Module], Module] = ^
}
