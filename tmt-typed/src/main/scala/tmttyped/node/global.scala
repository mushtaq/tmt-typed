package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.NodeJS.WritableStream
import tmttyped.node.nodeConsoleMod.global.Console_
import tmttyped.node.nodeConsoleMod.global.console.ConsoleConstructorOptions
import tmttyped.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AbortController")
  @js.native
  class AbortController ()
    extends StObject
       with tmttyped.node.AbortController {
    
    /**
      * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Returns the AbortSignal object associated with this object.
      */
    /* CompleteClass */
    override val signal: tmttyped.node.AbortSignal = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AbortSignal")
  @js.native
  class AbortSignal ()
    extends StObject
       with tmttyped.node.AbortSignal {
    
    /**
      * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
      */
    /* CompleteClass */
    override val aborted: Boolean = js.native
  }
  
  object console extends Shortcut {
    
    @JSGlobal("console")
    @js.native
    val ^ : Console_ = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("console.Console")
    @js.native
    class Console protected ()
      extends StObject
         with Console_ {
      def this(options: ConsoleConstructorOptions) = this()
      def this(stdout: WritableStream) = this()
      def this(stdout: WritableStream, stderr: WritableStream) = this()
      def this(stdout: WritableStream, stderr: Unit, ignoreErrors: Boolean) = this()
      def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
    }
    
    type _To = Console_
    
    /* This means you don't have to write `^`, but can instead just say `console.foo` */
    override def _to: Console_ = ^
  }
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: java.lang.String = js.native
  
  @scala.inline
  def dirname_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  @scala.inline
  def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  def filename: java.lang.String = js.native
  
  @scala.inline
  def filename_=(x: java.lang.String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  /**
    * Only available if `--expose-gc` is passed to the process.
    */
  @JSGlobal("gc")
  @js.native
  def gc: js.UndefOr[js.Function0[Unit]] = js.native
  @scala.inline
  def gc_=(x: js.UndefOr[js.Function0[Unit]]): Unit = js.Dynamic.global.updateDynamic("gc")(x.asInstanceOf[js.Any])
  
  @JSGlobal("global")
  @js.native
  def global: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ js.Any = js.native
  @scala.inline
  def global_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ js.Any
  ): Unit = js.Dynamic.global.updateDynamic("global")(x.asInstanceOf[js.Any])
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  @scala.inline
  def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  @scala.inline
  def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  //#endregion borrowed
  /*----------------------------------------------*
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  *-----------------------------------------------*/
  object NodeJS
}
