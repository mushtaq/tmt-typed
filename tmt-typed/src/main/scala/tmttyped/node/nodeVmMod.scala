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
  
  @JSImport("node:vm", "Script")
  @js.native
  class Script protected ()
    extends tmttyped.node.vmMod.Script {
    def this(code: java.lang.String) = this()
    def this(code: java.lang.String, options: ScriptOptions) = this()
  }
  
  @JSImport("node:vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String): js.Function = js.native
  @JSImport("node:vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String, params: js.UndefOr[scala.Nothing], options: CompileFunctionOptions): js.Function = js.native
  @JSImport("node:vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String]): js.Function = js.native
  @JSImport("node:vm", "compileFunction")
  @js.native
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String], options: CompileFunctionOptions): js.Function = js.native
  
  @JSImport("node:vm", "createContext")
  @js.native
  def createContext(): Context = js.native
  @JSImport("node:vm", "createContext")
  @js.native
  def createContext(sandbox: js.UndefOr[scala.Nothing], options: CreateContextOptions): Context = js.native
  @JSImport("node:vm", "createContext")
  @js.native
  def createContext(sandbox: Context): Context = js.native
  @JSImport("node:vm", "createContext")
  @js.native
  def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
  
  @JSImport("node:vm", "isContext")
  @js.native
  def isContext(sandbox: Context): Boolean = js.native
  
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
  @JSImport("node:vm", "measureMemory")
  @js.native
  def measureMemory(): js.Promise[MemoryMeasurement] = js.native
  @JSImport("node:vm", "measureMemory")
  @js.native
  def measureMemory(options: MeasureMemoryOptions): js.Promise[MemoryMeasurement] = js.native
  
  @JSImport("node:vm", "runInContext")
  @js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context): js.Any = js.native
  @JSImport("node:vm", "runInContext")
  @js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: java.lang.String): js.Any = js.native
  @JSImport("node:vm", "runInContext")
  @js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  @JSImport("node:vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String): js.Any = js.native
  @JSImport("node:vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: js.UndefOr[scala.Nothing], options: java.lang.String): js.Any = js.native
  @JSImport("node:vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: js.UndefOr[scala.Nothing], options: RunningScriptOptions): js.Any = js.native
  @JSImport("node:vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: Context): js.Any = js.native
  @JSImport("node:vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: java.lang.String): js.Any = js.native
  @JSImport("node:vm", "runInNewContext")
  @js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  
  @JSImport("node:vm", "runInThisContext")
  @js.native
  def runInThisContext(code: java.lang.String): js.Any = js.native
  @JSImport("node:vm", "runInThisContext")
  @js.native
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = js.native
  @JSImport("node:vm", "runInThisContext")
  @js.native
  def runInThisContext(code: java.lang.String, options: RunningScriptOptions): js.Any = js.native
}
