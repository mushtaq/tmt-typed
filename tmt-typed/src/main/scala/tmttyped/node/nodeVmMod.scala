package tmttyped.node

import tmttyped.node.vmMod.CompileFunctionOptions
import tmttyped.node.vmMod.Context
import tmttyped.node.vmMod.CreateContextOptions
import tmttyped.node.vmMod.MeasureMemoryOptions
import tmttyped.node.vmMod.MemoryMeasurement
import tmttyped.node.vmMod.RunningScriptOptions
import tmttyped.node.vmMod.ScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeVmMod {
  
  @JSImport("node:vm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:vm", "Script")
  @js.native
  class Script protected ()
    extends tmttyped.node.vmMod.Script {
    def this(code: java.lang.String) = this()
    def this(code: java.lang.String, options: ScriptOptions) = this()
  }
  
  @scala.inline
  def compileFunction(code: java.lang.String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def compileFunction(code: java.lang.String, params: js.UndefOr[scala.Nothing], options: CompileFunctionOptions): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  @scala.inline
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String], options: CompileFunctionOptions): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFunction")(code.asInstanceOf[js.Any], params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def createContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[Context]
  @scala.inline
  def createContext(sandbox: js.UndefOr[scala.Nothing], options: CreateContextOptions): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Context]
  @scala.inline
  def createContext(sandbox: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(sandbox.asInstanceOf[js.Any]).asInstanceOf[Context]
  @scala.inline
  def createContext(sandbox: Context, options: CreateContextOptions): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  @scala.inline
  def isContext(sandbox: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContext")(sandbox.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Measure the memory known to V8 and used by the current execution context or a specified context.
    *
    * The format of the object that the returned Promise may resolve with is
    * specific to the V8 engine and may change from one version of V8 to the next.
    *
    * The returned result is different from the statistics returned by
    * `v8.getHeapSpaceStatistics()` in that `vm.measureMemory()` measures
    * the memory reachable by V8 from a specific context, while
    * `v8.getHeapSpaceStatistics()` measures the memory used by an instance
    * of V8 engine, which can switch among multiple contexts that reference
    * objects in the heap of one engine.
    *
    * @experimental
    */
  @scala.inline
  def measureMemory(): js.Promise[MemoryMeasurement] = ^.asInstanceOf[js.Dynamic].applyDynamic("measureMemory")().asInstanceOf[js.Promise[MemoryMeasurement]]
  @scala.inline
  def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = ^.asInstanceOf[js.Dynamic].applyDynamic("measureMemory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MemoryMeasurement]]
  
  @scala.inline
  def runInContext(code: java.lang.String, contextifiedSandbox: Context): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInContext")(code.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def runInNewContext(code: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: js.UndefOr[scala.Nothing], options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Context): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Context, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInNewContext(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInNewContext")(code.asInstanceOf[js.Any], sandbox.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def runInThisContext(code: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def runInThisContext(code: java.lang.String, options: RunningScriptOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("runInThisContext")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
