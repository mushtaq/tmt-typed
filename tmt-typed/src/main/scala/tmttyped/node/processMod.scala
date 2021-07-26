package tmttyped.node

import org.scalablytyped.runtime.Shortcut
import tmttyped.node.NodeJS.Dict
import tmttyped.node.NodeJS.Module
import tmttyped.node.NodeJS.ReadWriteStream
import tmttyped.node.anon.Cflags
import tmttyped.node.anon.Clang
import tmttyped.node.anon.Debug
import tmttyped.node.anon.Fd
import tmttyped.node.anon.SwallowErrors
import tmttyped.node.anon.`5`
import tmttyped.node.anon.`6`
import tmttyped.node.eventsMod.global.NodeJS.EventEmitter
import tmttyped.node.nodeBooleans.`true`
import tmttyped.node.nodeStrings.beforeExit
import tmttyped.node.nodeStrings.disconnect
import tmttyped.node.nodeStrings.exit
import tmttyped.node.nodeStrings.message
import tmttyped.node.nodeStrings.multipleResolves
import tmttyped.node.nodeStrings.rejectionHandled
import tmttyped.node.nodeStrings.uncaughtException
import tmttyped.node.nodeStrings.uncaughtExceptionMonitor
import tmttyped.node.nodeStrings.unhandledRejection
import tmttyped.node.nodeStrings.warning
import tmttyped.node.nodeStrings.worker
import tmttyped.node.nodeWorkerThreadsMod.Worker
import tmttyped.node.processMod.global.NodeJS.Process
import tmttyped.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processMod extends Shortcut {
  
  @JSImport("process", JSImport.Namespace)
  @js.native
  val ^ : Process = js.native
  
  object global {
    
    @JSGlobal("process")
    @js.native
    def process: Process = js.native
    @scala.inline
    def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
    
    object NodeJS {
      
      type BeforeExitListener = js.Function1[/* code */ Double, Unit]
      
      trait CpuUsage extends StObject {
        
        var system: Double
        
        var user: Double
      }
      object CpuUsage {
        
        @scala.inline
        def apply(system: Double, user: Double): CpuUsage = {
          val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
          __obj.asInstanceOf[CpuUsage]
        }
        
        @scala.inline
        implicit class CpuUsageMutableBuilder[Self <: CpuUsage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSystem(value: Double): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        }
      }
      
      type DisconnectListener = js.Function0[Unit]
      
      trait EmitWarningOptions extends StObject {
        
        /**
          * A unique identifier for the warning instance being emitted.
          */
        var code: js.UndefOr[java.lang.String] = js.undefined
        
        /**
          * When `warning` is a `string`, `ctor` is an optional function used to limit the generated stack trace.
          *
          * @default process.emitWarning
          */
        var ctor: js.UndefOr[js.Function] = js.undefined
        
        /**
          * Additional text to include with the error.
          */
        var detail: js.UndefOr[java.lang.String] = js.undefined
        
        /**
          * When `warning` is a `string`, `type` is the name to use for the _type_ of warning being emitted.
          *
          * @default 'Warning'
          */
        var `type`: js.UndefOr[java.lang.String] = js.undefined
      }
      object EmitWarningOptions {
        
        @scala.inline
        def apply(): EmitWarningOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[EmitWarningOptions]
        }
        
        @scala.inline
        implicit class EmitWarningOptionsMutableBuilder[Self <: EmitWarningOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          @scala.inline
          def setCtor(value: js.Function): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
          
          @scala.inline
          def setDetail(value: java.lang.String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
          
          @scala.inline
          def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      type ExitListener = js.Function1[/* code */ Double, Unit]
      
      @js.native
      trait HRTime extends StObject {
        
        def apply(): js.Tuple2[Double, Double] = js.native
        def apply(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        
        def bigint(): js.BigInt = js.native
      }
      
      trait MemoryUsage extends StObject {
        
        var arrayBuffers: Double
        
        var external: Double
        
        var heapTotal: Double
        
        var heapUsed: Double
        
        var rss: Double
      }
      object MemoryUsage {
        
        @scala.inline
        def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): MemoryUsage = {
          val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
          __obj.asInstanceOf[MemoryUsage]
        }
        
        @scala.inline
        implicit class MemoryUsageMutableBuilder[Self <: MemoryUsage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setArrayBuffers(value: Double): Self = StObject.set(x, "arrayBuffers", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeapTotal(value: Double): Self = StObject.set(x, "heapTotal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait MemoryUsageFn extends StObject {
        
        /**
          * The `process.memoryUsage()` method iterate over each page to gather informations about memory
          * usage which can be slow depending on the program memory allocations.
          */
        def apply(): MemoryUsage = js.native
        
        /**
          * method returns an integer representing the Resident Set Size (RSS) in bytes.
          */
        def rss(): Double = js.native
      }
      
      type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, Unit]
      
      type MultipleResolveListener = js.Function3[
            /* type */ MultipleResolveType, 
            /* promise */ js.Promise[js.Any], 
            /* value */ js.Any, 
            Unit
          ]
      
      /* Rewritten from type alias, can be one of: 
        - tmttyped.node.nodeStrings.resolve
        - tmttyped.node.nodeStrings.reject
      */
      trait MultipleResolveType extends StObject
      object MultipleResolveType {
        
        @scala.inline
        def reject: tmttyped.node.nodeStrings.reject = "reject".asInstanceOf[tmttyped.node.nodeStrings.reject]
        
        @scala.inline
        def resolve: tmttyped.node.nodeStrings.resolve = "resolve".asInstanceOf[tmttyped.node.nodeStrings.resolve]
      }
      
      /* Rewritten from type alias, can be one of: 
        - tmttyped.node.nodeStrings.aix
        - tmttyped.node.nodeStrings.android
        - tmttyped.node.nodeStrings.darwin
        - tmttyped.node.nodeStrings.freebsd
        - tmttyped.node.nodeStrings.haiku
        - tmttyped.node.nodeStrings.linux
        - tmttyped.node.nodeStrings.openbsd
        - tmttyped.node.nodeStrings.sunos
        - tmttyped.node.nodeStrings.win32
        - tmttyped.node.nodeStrings.cygwin
        - tmttyped.node.nodeStrings.netbsd
      */
      trait Platform extends StObject
      object Platform {
        
        @scala.inline
        def aix: tmttyped.node.nodeStrings.aix = "aix".asInstanceOf[tmttyped.node.nodeStrings.aix]
        
        @scala.inline
        def android: tmttyped.node.nodeStrings.android = "android".asInstanceOf[tmttyped.node.nodeStrings.android]
        
        @scala.inline
        def cygwin: tmttyped.node.nodeStrings.cygwin = "cygwin".asInstanceOf[tmttyped.node.nodeStrings.cygwin]
        
        @scala.inline
        def darwin: tmttyped.node.nodeStrings.darwin = "darwin".asInstanceOf[tmttyped.node.nodeStrings.darwin]
        
        @scala.inline
        def freebsd: tmttyped.node.nodeStrings.freebsd = "freebsd".asInstanceOf[tmttyped.node.nodeStrings.freebsd]
        
        @scala.inline
        def haiku: tmttyped.node.nodeStrings.haiku = "haiku".asInstanceOf[tmttyped.node.nodeStrings.haiku]
        
        @scala.inline
        def linux: tmttyped.node.nodeStrings.linux = "linux".asInstanceOf[tmttyped.node.nodeStrings.linux]
        
        @scala.inline
        def netbsd: tmttyped.node.nodeStrings.netbsd = "netbsd".asInstanceOf[tmttyped.node.nodeStrings.netbsd]
        
        @scala.inline
        def openbsd: tmttyped.node.nodeStrings.openbsd = "openbsd".asInstanceOf[tmttyped.node.nodeStrings.openbsd]
        
        @scala.inline
        def sunos: tmttyped.node.nodeStrings.sunos = "sunos".asInstanceOf[tmttyped.node.nodeStrings.sunos]
        
        @scala.inline
        def win32: tmttyped.node.nodeStrings.win32 = "win32".asInstanceOf[tmttyped.node.nodeStrings.win32]
      }
      
      @js.native
      trait Process
        extends StObject
           with EventEmitter {
        
        /**
          * The `process.abort()` method causes the Node.js process to exit immediately and
          * generate a core file.
          *
          * This feature is not available in `Worker` threads.
          * @since v0.7.0
          */
        def abort(): scala.Nothing = js.native
        
        def addListener(event: Signals, listener: SignalsListener): this.type = js.native
        /* EventEmitter */
        @JSName("addListener")
        def addListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("addListener")
        def addListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("addListener")
        def addListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("addListener")
        def addListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("addListener")
        def addListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("addListener")
        def addListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("addListener")
        def addListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        def addListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("addListener")
        def addListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("addListener")
        def addListener_warning(event: warning, listener: WarningListener): this.type = js.native
        @JSName("addListener")
        def addListener_worker(event: worker, listener: WorkerListener): this.type = js.native
        
        /**
          * The `process.allowedNodeEnvironmentFlags` property is a special,
          * read-only `Set` of flags allowable within the `NODE_OPTIONS` environment variable.
          *
          * `process.allowedNodeEnvironmentFlags` extends `Set`, but overrides`Set.prototype.has` to recognize several different possible flag
          * representations. `process.allowedNodeEnvironmentFlags.has()` will
          * return `true` in the following cases:
          *
          * * Flags may omit leading single (`-`) or double (`--`) dashes; e.g.,`inspect-brk` for `--inspect-brk`, or `r` for `-r`.
          * * Flags passed through to V8 (as listed in `--v8-options`) may replace
          * one or more _non-leading_ dashes for an underscore, or vice-versa;
          * e.g., `--perf_basic_prof`, `--perf-basic-prof`, `--perf_basic-prof`,
          * etc.
          * * Flags may contain one or more equals (`=`) characters; all
          * characters after and including the first equals will be ignored;
          * e.g., `--stack-trace-limit=100`.
          * * Flags _must_ be allowable within `NODE_OPTIONS`.
          *
          * When iterating over `process.allowedNodeEnvironmentFlags`, flags will
          * appear only _once_; each will begin with one or more dashes. Flags
          * passed through to V8 will contain underscores instead of non-leading
          * dashes:
          *
          * ```js
          * process.allowedNodeEnvironmentFlags.forEach((flag) => {
          *   // -r
          *   // --inspect-brk
          *   // --abort_on_uncaught_exception
          *   // ...
          * });
          * ```
          *
          * The methods `add()`, `clear()`, and `delete()` of`process.allowedNodeEnvironmentFlags` do nothing, and will fail
          * silently.
          *
          * If Node.js was compiled _without_ `NODE_OPTIONS` support (shown in {@link config}), `process.allowedNodeEnvironmentFlags` will
          * contain what _would have_ been allowable.
          * @since v10.10.0
          */
        var allowedNodeEnvironmentFlags: ReadonlySet[java.lang.String] = js.native
        
        /**
          * The operating system CPU architecture for which the Node.js binary was compiled.
          * Possible values are: `'arm'`, `'arm64'`, `'ia32'`, `'mips'`,`'mipsel'`, `'ppc'`,`'ppc64'`, `'s390'`, `'s390x'`, `'x32'`, and `'x64'`.
          *
          * ```js
          * console.log(`This processor architecture is ${process.arch}`);
          * ```
          * @since v0.5.0
          */
        val arch: java.lang.String = js.native
        
        /**
          * The `process.argv` property returns an array containing the command-line
          * arguments passed when the Node.js process was launched. The first element will
          * be {@link execPath}. See `process.argv0` if access to the original value
          * of `argv[0]` is needed. The second element will be the path to the JavaScript
          * file being executed. The remaining elements will be any additional command-line
          * arguments.
          *
          * For example, assuming the following script for `process-args.js`:
          *
          * ```js
          * // print process.argv
          * process.argv.forEach((val, index) => {
          *   console.log(`${index}: ${val}`);
          * });
          * ```
          *
          * Launching the Node.js process as:
          *
          * ```console
          * $ node process-args.js one two=three four
          * ```
          *
          * Would generate the output:
          *
          * ```text
          * 0: /usr/local/bin/node
          * 1: /Users/mjr/work/node/process-args.js
          * 2: one
          * 3: two=three
          * 4: four
          * ```
          * @since v0.1.27
          */
        var argv: js.Array[java.lang.String] = js.native
        
        /**
          * The `process.argv0` property stores a read-only copy of the original value of`argv[0]` passed when Node.js starts.
          *
          * ```console
          * $ bash -c 'exec -a customArgv0 ./node'
          * > process.argv[0]
          * '/Volumes/code/external/node/out/Release/node'
          * > process.argv0
          * 'customArgv0'
          * ```
          * @since v6.4.0
          */
        var argv0: java.lang.String = js.native
        
        /**
          * The `process.chdir()` method changes the current working directory of the
          * Node.js process or throws an exception if doing so fails (for instance, if
          * the specified `directory` does not exist).
          *
          * ```js
          * console.log(`Starting directory: ${process.cwd()}`);
          * try {
          *   process.chdir('/tmp');
          *   console.log(`New directory: ${process.cwd()}`);
          * } catch (err) {
          *   console.error(`chdir: ${err}`);
          * }
          * ```
          *
          * This feature is not available in `Worker` threads.
          * @since v0.1.17
          */
        def chdir(directory: java.lang.String): Unit = js.native
        
        /**
          * The `process.config` property returns an `Object` containing the JavaScript
          * representation of the configure options used to compile the current Node.js
          * executable. This is the same as the `config.gypi` file that was produced when
          * running the `./configure` script.
          *
          * An example of the possible output looks like:
          *
          * ```js
          * {
          *   target_defaults:
          *    { cflags: [],
          *      default_configuration: 'Release',
          *      defines: [],
          *      include_dirs: [],
          *      libraries: [] },
          *   variables:
          *    {
          *      host_arch: 'x64',
          *      napi_build_version: 5,
          *      node_install_npm: 'true',
          *      node_prefix: '',
          *      node_shared_cares: 'false',
          *      node_shared_http_parser: 'false',
          *      node_shared_libuv: 'false',
          *      node_shared_zlib: 'false',
          *      node_use_dtrace: 'false',
          *      node_use_openssl: 'true',
          *      node_shared_openssl: 'false',
          *      strict_aliasing: 'true',
          *      target_arch: 'x64',
          *      v8_use_snapshot: 1
          *    }
          * }
          * ```
          *
          * The `process.config` property is **not** read-only and there are existing
          * modules in the ecosystem that are known to extend, modify, or entirely replace
          * the value of `process.config`.
          *
          * Modifying the `process.config` property, or any child-property of the`process.config` object has been deprecated. The `process.config` will be made
          * read-only in a future release.
          * @since v0.7.7
          */
        val config: ProcessConfig = js.native
        
        /**
          * If the Node.js process is spawned with an IPC channel (see the `Child Process` and `Cluster` documentation), the `process.connected` property will return`true` so long as the IPC
          * channel is connected and will return `false` after`process.disconnect()` is called.
          *
          * Once `process.connected` is `false`, it is no longer possible to send messages
          * over the IPC channel using `process.send()`.
          * @since v0.7.2
          */
        var connected: Boolean = js.native
        
        /**
          * The `process.cpuUsage()` method returns the user and system CPU time usage of
          * the current process, in an object with properties `user` and `system`, whose
          * values are microsecond values (millionth of a second). These values measure time
          * spent in user and system code respectively, and may end up being greater than
          * actual elapsed time if multiple CPU cores are performing work for this process.
          *
          * The result of a previous call to `process.cpuUsage()` can be passed as the
          * argument to the function, to get a diff reading.
          *
          * ```js
          * const startUsage = process.cpuUsage();
          * // { user: 38579, system: 6986 }
          *
          * // spin the CPU for 500 milliseconds
          * const now = Date.now();
          * while (Date.now() - now < 500);
          *
          * console.log(process.cpuUsage(startUsage));
          * // { user: 514883, system: 11226 }
          * ```
          * @since v6.1.0
          * @param previousValue A previous return value from calling `process.cpuUsage()`
          */
        def cpuUsage(): CpuUsage = js.native
        def cpuUsage(previousValue: CpuUsage): CpuUsage = js.native
        
        /**
          * The `process.cwd()` method returns the current working directory of the Node.js
          * process.
          *
          * ```js
          * console.log(`Current directory: ${process.cwd()}`);
          * ```
          * @since v0.1.8
          */
        def cwd(): java.lang.String = js.native
        
        /**
          * The port used by the Node.js debugger when enabled.
          *
          * ```js
          * process.debugPort = 5858;
          * ```
          * @since v0.7.2
          */
        var debugPort: Double = js.native
        
        /**
          * If the Node.js process is spawned with an IPC channel (see the `Child Process` and `Cluster` documentation), the `process.disconnect()` method will close the
          * IPC channel to the parent process, allowing the child process to exit gracefully
          * once there are no other connections keeping it alive.
          *
          * The effect of calling `process.disconnect()` is the same as calling `ChildProcess.disconnect()` from the parent process.
          *
          * If the Node.js process was not spawned with an IPC channel,`process.disconnect()` will be `undefined`.
          * @since v0.7.2
          */
        def disconnect(): Unit = js.native
        
        def emit(event: Signals, signal: Signals): Boolean = js.native
        
        /**
          * The `process.emitWarning()` method can be used to emit custom or application
          * specific process warnings. These can be listened for by adding a handler to the `'warning'` event.
          *
          * ```js
          * // Emit a warning with a code and additional detail.
          * process.emitWarning('Something happened!', {
          *   code: 'MY_WARNING',
          *   detail: 'This is some additional information'
          * });
          * // Emits:
          * // (node:56338) [MY_WARNING] Warning: Something happened!
          * // This is some additional information
          * ```
          *
          * In this example, an `Error` object is generated internally by`process.emitWarning()` and passed through to the `'warning'` handler.
          *
          * ```js
          * process.on('warning', (warning) => {
          *   console.warn(warning.name);    // 'Warning'
          *   console.warn(warning.message); // 'Something happened!'
          *   console.warn(warning.code);    // 'MY_WARNING'
          *   console.warn(warning.stack);   // Stack trace
          *   console.warn(warning.detail);  // 'This is some additional information'
          * });
          * ```
          *
          * If `warning` is passed as an `Error` object, the `options` argument is ignored.
          * @since v8.0.0
          * @param warning The warning to emit.
          */
        def emitWarning(warning: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, options: EmitWarningOptions): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: java.lang.String, code: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: java.lang.String, code: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: java.lang.String, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: Unit, code: java.lang.String): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: Unit, code: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: Unit, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: java.lang.String, `type`: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error): Unit = js.native
        def emitWarning(warning: js.Error, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, options: EmitWarningOptions): Unit = js.native
        def emitWarning(warning: js.Error, `type`: java.lang.String): Unit = js.native
        def emitWarning(warning: js.Error, `type`: java.lang.String, code: java.lang.String): Unit = js.native
        def emitWarning(warning: js.Error, `type`: java.lang.String, code: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: java.lang.String, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, code: java.lang.String): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, code: java.lang.String, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, code: Unit, ctor: js.Function): Unit = js.native
        def emitWarning(warning: js.Error, `type`: Unit, ctor: js.Function): Unit = js.native
        
        @JSName("emit")
        def emit_beforeExit(event: beforeExit, code: Double): Boolean = js.native
        @JSName("emit")
        def emit_disconnect(event: disconnect): Boolean = js.native
        @JSName("emit")
        def emit_exit(event: exit, code: Double): Boolean = js.native
        @JSName("emit")
        def emit_message(event: message, message: js.Any, sendHandle: js.Any): this.type = js.native
        @JSName("emit")
        def emit_multipleResolves(event: multipleResolves, `type`: MultipleResolveType, promise: js.Promise[js.Any], value: js.Any): this.type = js.native
        @JSName("emit")
        def emit_rejectionHandled(event: rejectionHandled, promise: js.Promise[js.Any]): Boolean = js.native
        @JSName("emit")
        def emit_uncaughtException(event: uncaughtException, error: js.Error): Boolean = js.native
        @JSName("emit")
        def emit_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, error: js.Error): Boolean = js.native
        @JSName("emit")
        def emit_unhandledRejection(event: unhandledRejection, reason: js.Any, promise: js.Promise[js.Any]): Boolean = js.native
        @JSName("emit")
        def emit_warning(event: warning, warning: js.Error): Boolean = js.native
        @JSName("emit")
        def emit_worker(event: worker, listener: WorkerListener): this.type = js.native
        
        /**
          * The `process.env` property returns an object containing the user environment.
          * See [`environ(7)`](http://man7.org/linux/man-pages/man7/environ.7.html).
          *
          * An example of this object looks like:
          *
          * ```js
          * {
          *   TERM: 'xterm-256color',
          *   SHELL: '/usr/local/bin/bash',
          *   USER: 'maciej',
          *   PATH: '~/.bin/:/usr/bin:/bin:/usr/sbin:/sbin:/usr/local/bin',
          *   PWD: '/Users/maciej',
          *   EDITOR: 'vim',
          *   SHLVL: '1',
          *   HOME: '/Users/maciej',
          *   LOGNAME: 'maciej',
          *   _: '/usr/local/bin/node'
          * }
          * ```
          *
          * It is possible to modify this object, but such modifications will not be
          * reflected outside the Node.js process, or (unless explicitly requested)
          * to other `Worker` threads.
          * In other words, the following example would not work:
          *
          * ```console
          * $ node -e 'process.env.foo = "bar"' &#x26;&#x26; echo $foo
          * ```
          *
          * While the following will:
          *
          * ```js
          * process.env.foo = 'bar';
          * console.log(process.env.foo);
          * ```
          *
          * Assigning a property on `process.env` will implicitly convert the value
          * to a string. **This behavior is deprecated.** Future versions of Node.js may
          * throw an error when the value is not a string, number, or boolean.
          *
          * ```js
          * process.env.test = null;
          * console.log(process.env.test);
          * // => 'null'
          * process.env.test = undefined;
          * console.log(process.env.test);
          * // => 'undefined'
          * ```
          *
          * Use `delete` to delete a property from `process.env`.
          *
          * ```js
          * process.env.TEST = 1;
          * delete process.env.TEST;
          * console.log(process.env.TEST);
          * // => undefined
          * ```
          *
          * On Windows operating systems, environment variables are case-insensitive.
          *
          * ```js
          * process.env.TEST = 1;
          * console.log(process.env.test);
          * // => 1
          * ```
          *
          * Unless explicitly specified when creating a `Worker` instance,
          * each `Worker` thread has its own copy of `process.env`, based on its
          * parent thread’s `process.env`, or whatever was specified as the `env` option
          * to the `Worker` constructor. Changes to `process.env` will not be visible
          * across `Worker` threads, and only the main thread can make changes that
          * are visible to the operating system or to native add-ons.
          * @since v0.1.27
          */
        var env: ProcessEnv = js.native
        
        /**
          * The `process.execArgv` property returns the set of Node.js-specific command-line
          * options passed when the Node.js process was launched. These options do not
          * appear in the array returned by the {@link argv} property, and do not
          * include the Node.js executable, the name of the script, or any options following
          * the script name. These options are useful in order to spawn child processes with
          * the same execution environment as the parent.
          *
          * ```console
          * $ node --harmony script.js --version
          * ```
          *
          * Results in `process.execArgv`:
          *
          * ```js
          * ['--harmony']
          * ```
          *
          * And `process.argv`:
          *
          * ```js
          * ['/usr/local/bin/node', 'script.js', '--version']
          * ```
          *
          * Refer to `Worker constructor` for the detailed behavior of worker
          * threads with this property.
          * @since v0.7.7
          */
        var execArgv: js.Array[java.lang.String] = js.native
        
        /**
          * The `process.execPath` property returns the absolute pathname of the executable
          * that started the Node.js process. Symbolic links, if any, are resolved.
          *
          * ```js
          * '/usr/local/bin/node'
          * ```
          * @since v0.1.100
          */
        var execPath: java.lang.String = js.native
        
        /**
          * The `process.exit()` method instructs Node.js to terminate the process
          * synchronously with an exit status of `code`. If `code` is omitted, exit uses
          * either the 'success' code `0` or the value of `process.exitCode` if it has been
          * set. Node.js will not terminate until all the `'exit'` event listeners are
          * called.
          *
          * To exit with a 'failure' code:
          *
          * ```js
          * process.exit(1);
          * ```
          *
          * The shell that executed Node.js should see the exit code as `1`.
          *
          * Calling `process.exit()` will force the process to exit as quickly as possible
          * even if there are still asynchronous operations pending that have not yet
          * completed fully, including I/O operations to `process.stdout` and`process.stderr`.
          *
          * In most situations, it is not actually necessary to call `process.exit()`explicitly. The Node.js process will exit on its own _if there is no additional_
          * _work pending_ in the event loop. The `process.exitCode` property can be set to
          * tell the process which exit code to use when the process exits gracefully.
          *
          * For instance, the following example illustrates a _misuse_ of the`process.exit()` method that could lead to data printed to stdout being
          * truncated and lost:
          *
          * ```js
          * // This is an example of what *not* to do:
          * if (someConditionNotMet()) {
          *   printUsageToStdout();
          *   process.exit(1);
          * }
          * ```
          *
          * The reason this is problematic is because writes to `process.stdout` in Node.js
          * are sometimes _asynchronous_ and may occur over multiple ticks of the Node.js
          * event loop. Calling `process.exit()`, however, forces the process to exit_before_ those additional writes to `stdout` can be performed.
          *
          * Rather than calling `process.exit()` directly, the code _should_ set the`process.exitCode` and allow the process to exit naturally by avoiding
          * scheduling any additional work for the event loop:
          *
          * ```js
          * // How to properly set the exit code while letting
          * // the process exit gracefully.
          * if (someConditionNotMet()) {
          *   printUsageToStdout();
          *   process.exitCode = 1;
          * }
          * ```
          *
          * If it is necessary to terminate the Node.js process due to an error condition,
          * throwing an _uncaught_ error and allowing the process to terminate accordingly
          * is safer than calling `process.exit()`.
          *
          * In `Worker` threads, this function stops the current thread rather
          * than the current process.
          * @since v0.1.13
          * @param code The exit code.
          */
        def exit(): scala.Nothing = js.native
        def exit(code: Double): scala.Nothing = js.native
        
        /**
          * A number which will be the process exit code, when the process either
          * exits gracefully, or is exited via {@link exit} without specifying
          * a code.
          *
          * Specifying a code to {@link exit} will override any
          * previous setting of `process.exitCode`.
          * @since v0.11.8
          */
        var exitCode: js.UndefOr[Double] = js.native
        
        var features: Debug = js.native
        
        /**
          * The `process.getegid()` method returns the numerical effective group identity
          * of the Node.js process. (See [`getegid(2)`](http://man7.org/linux/man-pages/man2/getegid.2.html).)
          *
          * ```js
          * if (process.getegid) {
          *   console.log(`Current gid: ${process.getegid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v2.0.0
          */
        def getegid(): Double = js.native
        
        /**
          * The `process.geteuid()` method returns the numerical effective user identity of
          * the process. (See [`geteuid(2)`](http://man7.org/linux/man-pages/man2/geteuid.2.html).)
          *
          * ```js
          * if (process.geteuid) {
          *   console.log(`Current uid: ${process.geteuid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v2.0.0
          */
        def geteuid(): Double = js.native
        
        /**
          * The `process.getgid()` method returns the numerical group identity of the
          * process. (See [`getgid(2)`](http://man7.org/linux/man-pages/man2/getgid.2.html).)
          *
          * ```js
          * if (process.getgid) {
          *   console.log(`Current gid: ${process.getgid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v0.1.31
          */
        def getgid(): Double = js.native
        
        /**
          * The `process.getgroups()` method returns an array with the supplementary group
          * IDs. POSIX leaves it unspecified if the effective group ID is included but
          * Node.js ensures it always is.
          *
          * ```js
          * if (process.getgroups) {
          *   console.log(process.getgroups()); // [ 16, 21, 297 ]
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v0.9.4
          */
        def getgroups(): js.Array[Double] = js.native
        
        /**
          * The `process.getuid()` method returns the numeric user identity of the process.
          * (See [`getuid(2)`](http://man7.org/linux/man-pages/man2/getuid.2.html).)
          *
          * ```js
          * if (process.getuid) {
          *   console.log(`Current uid: ${process.getuid()}`);
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * @since v0.1.28
          */
        def getuid(): Double = js.native
        
        /**
          * Indicates whether a callback has been set using {@link setUncaughtExceptionCaptureCallback}.
          * @since v9.3.0
          */
        def hasUncaughtExceptionCaptureCallback(): Boolean = js.native
        
        def hrtime(): js.Tuple2[Double, Double] = js.native
        def hrtime(time: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
        @JSName("hrtime")
        var hrtime_Original: HRTime = js.native
        
        /**
          * The `process.kill()` method sends the `signal` to the process identified by`pid`.
          *
          * Signal names are strings such as `'SIGINT'` or `'SIGHUP'`. See `Signal Events` and [`kill(2)`](http://man7.org/linux/man-pages/man2/kill.2.html) for more information.
          *
          * This method will throw an error if the target `pid` does not exist. As a special
          * case, a signal of `0` can be used to test for the existence of a process.
          * Windows platforms will throw an error if the `pid` is used to kill a process
          * group.
          *
          * Even though the name of this function is `process.kill()`, it is really just a
          * signal sender, like the `kill` system call. The signal sent may do something
          * other than kill the target process.
          *
          * ```js
          * process.on('SIGHUP', () => {
          *   console.log('Got SIGHUP signal.');
          * });
          *
          * setTimeout(() => {
          *   console.log('Exiting.');
          *   process.exit(0);
          * }, 100);
          *
          * process.kill(process.pid, 'SIGHUP');
          * ```
          *
          * When `SIGUSR1` is received by a Node.js process, Node.js will start the
          * debugger. See `Signal Events`.
          * @since v0.0.6
          * @param pid A process ID
          * @param signal The signal to send, either as a string or number.
          */
        def kill(pid: Double): `true` = js.native
        def kill(pid: Double, signal: java.lang.String): `true` = js.native
        def kill(pid: Double, signal: Double): `true` = js.native
        
        def listeners(event: Signals): js.Array[SignalsListener] = js.native
        @JSName("listeners")
        def listeners_beforeExit(event: beforeExit): js.Array[BeforeExitListener] = js.native
        @JSName("listeners")
        def listeners_disconnect(event: disconnect): js.Array[DisconnectListener] = js.native
        @JSName("listeners")
        def listeners_exit(event: exit): js.Array[ExitListener] = js.native
        @JSName("listeners")
        def listeners_message(event: message): js.Array[MessageListener] = js.native
        @JSName("listeners")
        def listeners_multipleResolves(event: multipleResolves): js.Array[MultipleResolveListener] = js.native
        @JSName("listeners")
        def listeners_rejectionHandled(event: rejectionHandled): js.Array[RejectionHandledListener] = js.native
        @JSName("listeners")
        def listeners_uncaughtException(event: uncaughtException): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        def listeners_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor): js.Array[UncaughtExceptionListener] = js.native
        @JSName("listeners")
        def listeners_unhandledRejection(event: unhandledRejection): js.Array[UnhandledRejectionListener] = js.native
        @JSName("listeners")
        def listeners_warning(event: warning): js.Array[WarningListener] = js.native
        @JSName("listeners")
        def listeners_worker(event: worker): js.Array[WorkerListener] = js.native
        
        /**
          * The `process.mainModule` property provides an alternative way of retrieving `require.main`. The difference is that if the main module changes at
          * runtime, `require.main` may still refer to the original main module in
          * modules that were required before the change occurred. Generally, it's
          * safe to assume that the two refer to the same module.
          *
          * As with `require.main`, `process.mainModule` will be `undefined` if there
          * is no entry script.
          * @since v0.1.17
          * @deprecated Since v14.0.0 - Use `main` instead.
          */
        var mainModule: js.UndefOr[Module] = js.native
        
        /**
          * The `process.memoryUsage()` method iterate over each page to gather informations about memory
          * usage which can be slow depending on the program memory allocations.
          */
        def memoryUsage(): MemoryUsage = js.native
        @JSName("memoryUsage")
        var memoryUsage_Original: MemoryUsageFn = js.native
        
        /**
          * `process.nextTick()` adds `callback` to the "next tick queue". This queue is
          * fully drained after the current operation on the JavaScript stack runs to
          * completion and before the event loop is allowed to continue. It's possible to
          * create an infinite loop if one were to recursively call `process.nextTick()`.
          * See the [Event Loop](https://nodejs.org/en/docs/guides/event-loop-timers-and-nexttick/#process-nexttick) guide for more background.
          *
          * ```js
          * console.log('start');
          * process.nextTick(() => {
          *   console.log('nextTick callback');
          * });
          * console.log('scheduled');
          * // Output:
          * // start
          * // scheduled
          * // nextTick callback
          * ```
          *
          * This is important when developing APIs in order to give users the opportunity
          * to assign event handlers _after_ an object has been constructed but before any
          * I/O has occurred:
          *
          * ```js
          * function MyThing(options) {
          *   this.setupOptions(options);
          *
          *   process.nextTick(() => {
          *     this.startDoingStuff();
          *   });
          * }
          *
          * const thing = new MyThing();
          * thing.getReadyForStuff();
          *
          * // thing.startDoingStuff() gets called now, not before.
          * ```
          *
          * It is very important for APIs to be either 100% synchronous or 100%
          * asynchronous. Consider this example:
          *
          * ```js
          * // WARNING!  DO NOT USE!  BAD UNSAFE HAZARD!
          * function maybeSync(arg, cb) {
          *   if (arg) {
          *     cb();
          *     return;
          *   }
          *
          *   fs.stat('file', cb);
          * }
          * ```
          *
          * This API is hazardous because in the following case:
          *
          * ```js
          * const maybeTrue = Math.random() > 0.5;
          *
          * maybeSync(maybeTrue, () => {
          *   foo();
          * });
          *
          * bar();
          * ```
          *
          * It is not clear whether `foo()` or `bar()` will be called first.
          *
          * The following approach is much better:
          *
          * ```js
          * function definitelyAsync(arg, cb) {
          *   if (arg) {
          *     process.nextTick(cb);
          *     return;
          *   }
          *
          *   fs.stat('file', cb);
          * }
          * ```
          * @since v0.1.26
          * @param ...args Additional arguments to pass when invoking the `callback`
          */
        def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
        
        def on(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("on")
        def on_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("on")
        def on_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("on")
        def on_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("on")
        def on_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("on")
        def on_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("on")
        def on_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("on")
        def on_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        def on_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("on")
        def on_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("on")
        def on_warning(event: warning, listener: WarningListener): this.type = js.native
        @JSName("on")
        def on_worker(event: worker, listener: WorkerListener): this.type = js.native
        
        def once(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("once")
        def once_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("once")
        def once_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("once")
        def once_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("once")
        def once_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("once")
        def once_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("once")
        def once_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("once")
        def once_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        def once_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("once")
        def once_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("once")
        def once_warning(event: warning, listener: WarningListener): this.type = js.native
        @JSName("once")
        def once_worker(event: worker, listener: WorkerListener): this.type = js.native
        
        def openStdin(): Socket = js.native
        
        /**
          * The `process.pid` property returns the PID of the process.
          *
          * ```js
          * console.log(`This process is pid ${process.pid}`);
          * ```
          * @since v0.1.15
          */
        val pid: Double = js.native
        
        /**
          * The `process.platform` property returns a string identifying the operating
          * system platform on which the Node.js process is running.
          *
          * Currently possible values are:
          *
          * * `'aix'`
          * * `'darwin'`
          * * `'freebsd'`
          * * `'linux'`
          * * `'openbsd'`
          * * `'sunos'`
          * * `'win32'`
          *
          * ```js
          * console.log(`This platform is ${process.platform}`);
          * ```
          *
          * The value `'android'` may also be returned if the Node.js is built on the
          * Android operating system. However, Android support in Node.js[is experimental](https://github.com/nodejs/node/blob/HEAD/BUILDING.md#androidandroid-based-devices-eg-firefox-os).
          * @since v0.1.16
          */
        val platform: Platform = js.native
        
        /**
          * The `process.ppid` property returns the PID of the parent of the
          * current process.
          *
          * ```js
          * console.log(`The parent process is pid ${process.ppid}`);
          * ```
          * @since v9.2.0, v8.10.0, v6.13.0
          */
        val ppid: Double = js.native
        
        def prependListener(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_warning(event: warning, listener: WarningListener): this.type = js.native
        @JSName("prependListener")
        def prependListener_worker(event: worker, listener: WorkerListener): this.type = js.native
        
        def prependOnceListener(event: Signals, listener: SignalsListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_beforeExit(event: beforeExit, listener: BeforeExitListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_disconnect(event: disconnect, listener: DisconnectListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_exit(event: exit, listener: ExitListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_message(event: message, listener: MessageListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_multipleResolves(event: multipleResolves, listener: MultipleResolveListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_rejectionHandled(event: rejectionHandled, listener: RejectionHandledListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_uncaughtException(event: uncaughtException, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_uncaughtExceptionMonitor(event: uncaughtExceptionMonitor, listener: UncaughtExceptionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_unhandledRejection(event: unhandledRejection, listener: UnhandledRejectionListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_warning(event: warning, listener: WarningListener): this.type = js.native
        @JSName("prependOnceListener")
        def prependOnceListener_worker(event: worker, listener: WorkerListener): this.type = js.native
        
        /**
          * The `process.release` property returns an `Object` containing metadata related
          * to the current release, including URLs for the source tarball and headers-only
          * tarball.
          *
          * `process.release` contains the following properties:
          *
          * ```js
          * {
          *   name: 'node',
          *   lts: 'Erbium',
          *   sourceUrl: 'https://nodejs.org/download/release/v12.18.1/node-v12.18.1.tar.gz',
          *   headersUrl: 'https://nodejs.org/download/release/v12.18.1/node-v12.18.1-headers.tar.gz',
          *   libUrl: 'https://nodejs.org/download/release/v12.18.1/win-x64/node.lib'
          * }
          * ```
          *
          * In custom builds from non-release versions of the source tree, only the`name` property may be present. The additional properties should not be
          * relied upon to exist.
          * @since v3.0.0
          */
        val release: ProcessRelease = js.native
        
        /**
          * `process.report` is an object whose methods are used to generate diagnostic
          * reports for the current process. Additional documentation is available in the `report documentation`.
          * @since v11.8.0
          */
        var report: js.UndefOr[ProcessReport] = js.native
        
        /**
          * ```js
          * console.log(process.resourceUsage());
          * / *
          *   Will output:
          *   {
          *     userCPUTime: 82872,
          *     systemCPUTime: 4143,
          *     maxRSS: 33164,
          *     sharedMemorySize: 0,
          *     unsharedDataSize: 0,
          *     unsharedStackSize: 0,
          *     minorPageFault: 2469,
          *     majorPageFault: 0,
          *     swappedOut: 0,
          *     fsRead: 0,
          *     fsWrite: 8,
          *     ipcSent: 0,
          *     ipcReceived: 0,
          *     signalsCount: 0,
          *     voluntaryContextSwitches: 79,
          *     involuntaryContextSwitches: 1
          *   }
          *
          * ```
          * @since v12.6.0
          * @return the resource usage for the current process. All of these values come from the `uv_getrusage` call which returns a [`uv_rusage_t` struct][uv_rusage_t].
          */
        def resourceUsage(): ResourceUsage = js.native
        
        /**
          * If Node.js is spawned with an IPC channel, the `process.send()` method can be
          * used to send messages to the parent process. Messages will be received as a `'message'` event on the parent's `ChildProcess` object.
          *
          * If Node.js was not spawned with an IPC channel, `process.send` will be`undefined`.
          *
          * The message goes through serialization and parsing. The resulting message might
          * not be the same as what is originally sent.
          * @since v0.5.9
          * @param options used to parameterize the sending of certain types of handles.`options` supports the following properties:
          */
        var send: js.UndefOr[
                js.Function4[
                  /* message */ js.Any, 
                  /* sendHandle */ js.UndefOr[js.Any], 
                  /* options */ js.UndefOr[SwallowErrors], 
                  /* callback */ js.UndefOr[js.Function1[/* error */ js.Error | Null, Unit]], 
                  Boolean
                ]
              ] = js.native
        
        /**
          * The `process.setUncaughtExceptionCaptureCallback()` function sets a function
          * that will be invoked when an uncaught exception occurs, which will receive the
          * exception value itself as its first argument.
          *
          * If such a function is set, the `'uncaughtException'` event will
          * not be emitted. If `--abort-on-uncaught-exception` was passed from the
          * command line or set through `v8.setFlagsFromString()`, the process will
          * not abort. Actions configured to take place on exceptions such as report
          * generations will be affected too
          *
          * To unset the capture function,`process.setUncaughtExceptionCaptureCallback(null)` may be used. Calling this
          * method with a non-`null` argument while another capture function is set will
          * throw an error.
          *
          * Using this function is mutually exclusive with using the deprecated `domain` built-in module.
          * @since v9.3.0
          */
        def setUncaughtExceptionCaptureCallback(): Unit = js.native
        def setUncaughtExceptionCaptureCallback(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
        
        def setegid(id: java.lang.String): Unit = js.native
        /**
          * The `process.setegid()` method sets the effective group identity of the process.
          * (See [`setegid(2)`](http://man7.org/linux/man-pages/man2/setegid.2.html).) The `id` can be passed as either a numeric ID or a group
          * name string. If a group name is specified, this method blocks while resolving
          * the associated a numeric ID.
          *
          * ```js
          * if (process.getegid &#x26;&#x26; process.setegid) {
          *   console.log(`Current gid: ${process.getegid()}`);
          *   try {
          *     process.setegid(501);
          *     console.log(`New gid: ${process.getegid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set gid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v2.0.0
          * @param id A group name or ID
          */
        def setegid(id: Double): Unit = js.native
        
        def seteuid(id: java.lang.String): Unit = js.native
        /**
          * The `process.seteuid()` method sets the effective user identity of the process.
          * (See [`seteuid(2)`](http://man7.org/linux/man-pages/man2/seteuid.2.html).) The `id` can be passed as either a numeric ID or a username
          * string. If a username is specified, the method blocks while resolving the
          * associated numeric ID.
          *
          * ```js
          * if (process.geteuid &#x26;&#x26; process.seteuid) {
          *   console.log(`Current uid: ${process.geteuid()}`);
          *   try {
          *     process.seteuid(501);
          *     console.log(`New uid: ${process.geteuid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set uid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v2.0.0
          * @param id A user name or ID
          */
        def seteuid(id: Double): Unit = js.native
        
        def setgid(id: java.lang.String): Unit = js.native
        /**
          * The `process.setgid()` method sets the group identity of the process. (See[`setgid(2)`](http://man7.org/linux/man-pages/man2/setgid.2.html).) The `id` can be passed as either a
          * numeric ID or a group name
          * string. If a group name is specified, this method blocks while resolving the
          * associated numeric ID.
          *
          * ```js
          * if (process.getgid &#x26;&#x26; process.setgid) {
          *   console.log(`Current gid: ${process.getgid()}`);
          *   try {
          *     process.setgid(501);
          *     console.log(`New gid: ${process.getgid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set gid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v0.1.31
          * @param id The group name or ID
          */
        def setgid(id: Double): Unit = js.native
        
        /**
          * The `process.setgroups()` method sets the supplementary group IDs for the
          * Node.js process. This is a privileged operation that requires the Node.js
          * process to have `root` or the `CAP_SETGID` capability.
          *
          * The `groups` array can contain numeric group IDs, group names, or both.
          *
          * ```js
          * if (process.getgroups &#x26;&#x26; process.setgroups) {
          *   try {
          *     process.setgroups([501]);
          *     console.log(process.getgroups()); // new groups
          *   } catch (err) {
          *     console.log(`Failed to set groups: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v0.9.4
          */
        def setgroups(groups: js.Array[java.lang.String | Double]): Unit = js.native
        
        def setuid(id: java.lang.String): Unit = js.native
        /**
          * The `process.setuid(id)` method sets the user identity of the process. (See[`setuid(2)`](http://man7.org/linux/man-pages/man2/setuid.2.html).) The `id` can be passed as either a
          * numeric ID or a username string.
          * If a username is specified, the method blocks while resolving the associated
          * numeric ID.
          *
          * ```js
          * if (process.getuid &#x26;&#x26; process.setuid) {
          *   console.log(`Current uid: ${process.getuid()}`);
          *   try {
          *     process.setuid(501);
          *     console.log(`New uid: ${process.getuid()}`);
          *   } catch (err) {
          *     console.log(`Failed to set uid: ${err}`);
          *   }
          * }
          * ```
          *
          * This function is only available on POSIX platforms (i.e. not Windows or
          * Android).
          * This feature is not available in `Worker` threads.
          * @since v0.1.28
          */
        def setuid(id: Double): Unit = js.native
        
        /**
          * The `process.stderr` property returns a stream connected to`stderr` (fd `2`). It is a `net.Socket` (which is a `Duplex` stream) unless fd `2` refers to a file, in which case it is
          * a `Writable` stream.
          *
          * `process.stderr` differs from other Node.js streams in important ways. See `note on process I/O` for more information.
          */
        var stderr: WriteStream with `5` = js.native
        
        /**
          * The `process.stdin` property returns a stream connected to`stdin` (fd `0`). It is a `net.Socket` (which is a `Duplex` stream) unless fd `0` refers to a file, in which case it is
          * a `Readable` stream.
          *
          * For details of how to read from `stdin` see `readable.read()`.
          *
          * As a `Duplex` stream, `process.stdin` can also be used in "old" mode that
          * is compatible with scripts written for Node.js prior to v0.10\.
          * For more information see `Stream compatibility`.
          *
          * In "old" streams mode the `stdin` stream is paused by default, so one
          * must call `process.stdin.resume()` to read from it. Note also that calling`process.stdin.resume()` itself would switch stream to "old" mode.
          */
        var stdin: ReadStream with `6` = js.native
        
        /**
          * The `process.stdout` property returns a stream connected to`stdout` (fd `1`). It is a `net.Socket` (which is a `Duplex` stream) unless fd `1` refers to a file, in which case it is
          * a `Writable` stream.
          *
          * For example, to copy `process.stdin` to `process.stdout`:
          *
          * ```js
          * process.stdin.pipe(process.stdout);
          * ```
          *
          * `process.stdout` differs from other Node.js streams in important ways. See `note on process I/O` for more information.
          */
        var stdout: WriteStream with Fd = js.native
        
        /**
          * The `process.title` property returns the current process title (i.e. returns
          * the current value of `ps`). Assigning a new value to `process.title` modifies
          * the current value of `ps`.
          *
          * When a new value is assigned, different platforms will impose different maximum
          * length restrictions on the title. Usually such restrictions are quite limited.
          * For instance, on Linux and macOS, `process.title` is limited to the size of the
          * binary name plus the length of the command-line arguments because setting the`process.title` overwrites the `argv` memory of the process. Node.js v0.8
          * allowed for longer process title strings by also overwriting the `environ`memory but that was potentially insecure and confusing in some (rather obscure)
          * cases.
          *
          * Assigning a value to `process.title` might not result in an accurate label
          * within process manager applications such as macOS Activity Monitor or Windows
          * Services Manager.
          * @since v0.1.104
          */
        var title: java.lang.String = js.native
        
        /**
          * The `process.traceDeprecation` property indicates whether the`--trace-deprecation` flag is set on the current Node.js process. See the
          * documentation for the `'warning' event` and the `emitWarning() method` for more information about this
          * flag's behavior.
          * @since v0.8.0
          */
        var traceDeprecation: Boolean = js.native
        
        /**
          * `process.umask()` returns the Node.js process's file mode creation mask. Child
          * processes inherit the mask from the parent process.
          * @since v0.1.19
          * @deprecated Deprecated. Calling `process.umask()` with no argument causes the process-wide umask to be written twice. This introduces a race condition between threads, and is a   *
          * potential security vulnerability. There is no safe, cross-platform alternative API.
          */
        def umask(): Double = js.native
        /**
          * Can only be set if not in worker thread.
          */
        def umask(mask: java.lang.String): Double = js.native
        def umask(mask: Double): Double = js.native
        
        /**
          * The `process.uptime()` method returns the number of seconds the current Node.js
          * process has been running.
          *
          * The return value includes fractions of a second. Use `Math.floor()` to get whole
          * seconds.
          * @since v0.5.0
          */
        def uptime(): Double = js.native
        
        /**
          * The `process.version` property contains the Node.js version string.
          *
          * ```js
          * console.log(`Version: ${process.version}`);
          * // Version: v14.8.0
          * ```
          *
          * To get the version string without the prepended _v_, use`process.versions.node`.
          * @since v0.1.3
          */
        val version: java.lang.String = js.native
        
        /**
          * The `process.versions` property returns an object listing the version strings of
          * Node.js and its dependencies. `process.versions.modules` indicates the current
          * ABI version, which is increased whenever a C++ API changes. Node.js will refuse
          * to load modules that were compiled against a different module ABI version.
          *
          * ```js
          * console.log(process.versions);
          * ```
          *
          * Will generate an object similar to:
          *
          * ```console
          * { node: '11.13.0',
          *   v8: '7.0.276.38-node.18',
          *   uv: '1.27.0',
          *   zlib: '1.2.11',
          *   brotli: '1.0.7',
          *   ares: '1.15.0',
          *   modules: '67',
          *   nghttp2: '1.34.0',
          *   napi: '4',
          *   llhttp: '1.1.1',
          *   openssl: '1.1.1b',
          *   cldr: '34.0',
          *   icu: '63.1',
          *   tz: '2018e',
          *   unicode: '11.0' }
          * ```
          * @since v0.2.0
          */
        val versions: ProcessVersions = js.native
      }
      
      trait ProcessConfig extends StObject {
        
        val target_defaults: Cflags
        
        val variables: Clang
      }
      object ProcessConfig {
        
        @scala.inline
        def apply(target_defaults: Cflags, variables: Clang): ProcessConfig = {
          val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessConfig]
        }
        
        @scala.inline
        implicit class ProcessConfigMutableBuilder[Self <: ProcessConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setTarget_defaults(value: Cflags): Self = StObject.set(x, "target_defaults", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVariables(value: Clang): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
        }
      }
      
      // Alias for compatibility
      trait ProcessEnv
        extends StObject
           with Dict[java.lang.String] {
        
        /**
          * Can be used to change the default timezone at runtime
          */
        var TZ: js.UndefOr[java.lang.String] = js.undefined
      }
      object ProcessEnv {
        
        @scala.inline
        def apply(): ProcessEnv = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessEnv]
        }
        
        @scala.inline
        implicit class ProcessEnvMutableBuilder[Self <: ProcessEnv] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setTZ(value: java.lang.String): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
        }
      }
      
      trait ProcessRelease extends StObject {
        
        var headersUrl: js.UndefOr[java.lang.String] = js.undefined
        
        var libUrl: js.UndefOr[java.lang.String] = js.undefined
        
        var lts: js.UndefOr[java.lang.String] = js.undefined
        
        var name: java.lang.String
        
        var sourceUrl: js.UndefOr[java.lang.String] = js.undefined
      }
      object ProcessRelease {
        
        @scala.inline
        def apply(name: java.lang.String): ProcessRelease = {
          val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessRelease]
        }
        
        @scala.inline
        implicit class ProcessReleaseMutableBuilder[Self <: ProcessRelease] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHeadersUrl(value: java.lang.String): Self = StObject.set(x, "headersUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeadersUrlUndefined: Self = StObject.set(x, "headersUrl", js.undefined)
          
          @scala.inline
          def setLibUrl(value: java.lang.String): Self = StObject.set(x, "libUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLibUrlUndefined: Self = StObject.set(x, "libUrl", js.undefined)
          
          @scala.inline
          def setLts(value: java.lang.String): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLtsUndefined: Self = StObject.set(x, "lts", js.undefined)
          
          @scala.inline
          def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSourceUrl(value: java.lang.String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
        }
      }
      
      @js.native
      trait ProcessReport extends StObject {
        
        /**
          * Directory where the report is written.
          * working directory of the Node.js process.
          * @default '' indicating that reports are written to the current
          */
        var directory: java.lang.String = js.native
        
        /**
          * Filename where the report is written.
          * The default value is the empty string.
          * @default '' the output filename will be comprised of a timestamp,
          * PID, and sequence number.
          */
        var filename: java.lang.String = js.native
        
        /**
          * Returns a JSON-formatted diagnostic report for the running process.
          * The report's JavaScript stack trace is taken from err, if present.
          */
        def getReport(): java.lang.String = js.native
        def getReport(err: js.Error): java.lang.String = js.native
        
        /**
          * If true, a diagnostic report is generated on fatal errors,
          * such as out of memory errors or failed C++ assertions.
          * @default false
          */
        var reportOnFatalError: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated when the process
          * receives the signal specified by process.report.signal.
          * @defaul false
          */
        var reportOnSignal: Boolean = js.native
        
        /**
          * If true, a diagnostic report is generated on uncaught exception.
          * @default false
          */
        var reportOnUncaughtException: Boolean = js.native
        
        /**
          * The signal used to trigger the creation of a diagnostic report.
          * @default 'SIGUSR2'
          */
        var signal: Signals = js.native
        
        /**
          * Writes a diagnostic report to a file. If filename is not provided, the default filename
          * includes the date, time, PID, and a sequence number.
          * The report's JavaScript stack trace is taken from err, if present.
          *
          * @param fileName Name of the file where the report is written.
          * This should be a relative path, that will be appended to the directory specified in
          * `process.report.directory`, or the current working directory of the Node.js process,
          * if unspecified.
          * @param error A custom error used for reporting the JavaScript stack.
          * @return Filename of the generated report.
          */
        def writeReport(): java.lang.String = js.native
        def writeReport(error: js.Error): java.lang.String = js.native
        def writeReport(fileName: java.lang.String): java.lang.String = js.native
        def writeReport(fileName: java.lang.String, err: js.Error): java.lang.String = js.native
        def writeReport(fileName: Unit, err: js.Error): java.lang.String = js.native
      }
      
      trait ProcessVersions
        extends StObject
           with Dict[java.lang.String] {
        
        var ares: java.lang.String
        
        var http_parser: java.lang.String
        
        var modules: java.lang.String
        
        var node: java.lang.String
        
        var openssl: java.lang.String
        
        var uv: java.lang.String
        
        var v8: java.lang.String
        
        var zlib: java.lang.String
      }
      object ProcessVersions {
        
        @scala.inline
        def apply(
          ares: java.lang.String,
          http_parser: java.lang.String,
          modules: java.lang.String,
          node: java.lang.String,
          openssl: java.lang.String,
          uv: java.lang.String,
          v8: java.lang.String,
          zlib: java.lang.String
        ): ProcessVersions = {
          val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProcessVersions]
        }
        
        @scala.inline
        implicit class ProcessVersionsMutableBuilder[Self <: ProcessVersions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAres(value: java.lang.String): Self = StObject.set(x, "ares", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHttp_parser(value: java.lang.String): Self = StObject.set(x, "http_parser", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModules(value: java.lang.String): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNode(value: java.lang.String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOpenssl(value: java.lang.String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUv(value: java.lang.String): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setV8(value: java.lang.String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setZlib(value: java.lang.String): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
        }
      }
      
      // this namespace merge is here because these are specifically used
      // as the type for process.stdin, process.stdout, and process.stderr.
      // they can't live in tty.d.ts because we need to disambiguate the imported name.
      type ReadStream = tmttyped.node.nodeTtyMod.ReadStream
      
      type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], Unit]
      
      trait ResourceUsage extends StObject {
        
        var fsRead: Double
        
        var fsWrite: Double
        
        var involuntaryContextSwitches: Double
        
        var ipcReceived: Double
        
        var ipcSent: Double
        
        var majorPageFault: Double
        
        var maxRSS: Double
        
        var minorPageFault: Double
        
        var sharedMemorySize: Double
        
        var signalsCount: Double
        
        var swappedOut: Double
        
        var systemCPUTime: Double
        
        var unsharedDataSize: Double
        
        var unsharedStackSize: Double
        
        var userCPUTime: Double
        
        var voluntaryContextSwitches: Double
      }
      object ResourceUsage {
        
        @scala.inline
        def apply(
          fsRead: Double,
          fsWrite: Double,
          involuntaryContextSwitches: Double,
          ipcReceived: Double,
          ipcSent: Double,
          majorPageFault: Double,
          maxRSS: Double,
          minorPageFault: Double,
          sharedMemorySize: Double,
          signalsCount: Double,
          swappedOut: Double,
          systemCPUTime: Double,
          unsharedDataSize: Double,
          unsharedStackSize: Double,
          userCPUTime: Double,
          voluntaryContextSwitches: Double
        ): ResourceUsage = {
          val __obj = js.Dynamic.literal(fsRead = fsRead.asInstanceOf[js.Any], fsWrite = fsWrite.asInstanceOf[js.Any], involuntaryContextSwitches = involuntaryContextSwitches.asInstanceOf[js.Any], ipcReceived = ipcReceived.asInstanceOf[js.Any], ipcSent = ipcSent.asInstanceOf[js.Any], majorPageFault = majorPageFault.asInstanceOf[js.Any], maxRSS = maxRSS.asInstanceOf[js.Any], minorPageFault = minorPageFault.asInstanceOf[js.Any], sharedMemorySize = sharedMemorySize.asInstanceOf[js.Any], signalsCount = signalsCount.asInstanceOf[js.Any], swappedOut = swappedOut.asInstanceOf[js.Any], systemCPUTime = systemCPUTime.asInstanceOf[js.Any], unsharedDataSize = unsharedDataSize.asInstanceOf[js.Any], unsharedStackSize = unsharedStackSize.asInstanceOf[js.Any], userCPUTime = userCPUTime.asInstanceOf[js.Any], voluntaryContextSwitches = voluntaryContextSwitches.asInstanceOf[js.Any])
          __obj.asInstanceOf[ResourceUsage]
        }
        
        @scala.inline
        implicit class ResourceUsageMutableBuilder[Self <: ResourceUsage] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFsRead(value: Double): Self = StObject.set(x, "fsRead", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFsWrite(value: Double): Self = StObject.set(x, "fsWrite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInvoluntaryContextSwitches(value: Double): Self = StObject.set(x, "involuntaryContextSwitches", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIpcReceived(value: Double): Self = StObject.set(x, "ipcReceived", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIpcSent(value: Double): Self = StObject.set(x, "ipcSent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMajorPageFault(value: Double): Self = StObject.set(x, "majorPageFault", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxRSS(value: Double): Self = StObject.set(x, "maxRSS", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinorPageFault(value: Double): Self = StObject.set(x, "minorPageFault", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSharedMemorySize(value: Double): Self = StObject.set(x, "sharedMemorySize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSignalsCount(value: Double): Self = StObject.set(x, "signalsCount", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSwappedOut(value: Double): Self = StObject.set(x, "swappedOut", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSystemCPUTime(value: Double): Self = StObject.set(x, "systemCPUTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUnsharedDataSize(value: Double): Self = StObject.set(x, "unsharedDataSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUnsharedStackSize(value: Double): Self = StObject.set(x, "unsharedStackSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserCPUTime(value: Double): Self = StObject.set(x, "userCPUTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVoluntaryContextSwitches(value: Double): Self = StObject.set(x, "voluntaryContextSwitches", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - tmttyped.node.nodeStrings.SIGABRT
        - tmttyped.node.nodeStrings.SIGALRM
        - tmttyped.node.nodeStrings.SIGBUS
        - tmttyped.node.nodeStrings.SIGCHLD
        - tmttyped.node.nodeStrings.SIGCONT
        - tmttyped.node.nodeStrings.SIGFPE
        - tmttyped.node.nodeStrings.SIGHUP
        - tmttyped.node.nodeStrings.SIGILL
        - tmttyped.node.nodeStrings.SIGINT
        - tmttyped.node.nodeStrings.SIGIO
        - tmttyped.node.nodeStrings.SIGIOT
        - tmttyped.node.nodeStrings.SIGKILL
        - tmttyped.node.nodeStrings.SIGPIPE
        - tmttyped.node.nodeStrings.SIGPOLL
        - tmttyped.node.nodeStrings.SIGPROF
        - tmttyped.node.nodeStrings.SIGPWR
        - tmttyped.node.nodeStrings.SIGQUIT
        - tmttyped.node.nodeStrings.SIGSEGV
        - tmttyped.node.nodeStrings.SIGSTKFLT
        - tmttyped.node.nodeStrings.SIGSTOP
        - tmttyped.node.nodeStrings.SIGSYS
        - tmttyped.node.nodeStrings.SIGTERM
        - tmttyped.node.nodeStrings.SIGTRAP
        - tmttyped.node.nodeStrings.SIGTSTP
        - tmttyped.node.nodeStrings.SIGTTIN
        - tmttyped.node.nodeStrings.SIGTTOU
        - tmttyped.node.nodeStrings.SIGUNUSED
        - tmttyped.node.nodeStrings.SIGURG
        - tmttyped.node.nodeStrings.SIGUSR1
        - tmttyped.node.nodeStrings.SIGUSR2
        - tmttyped.node.nodeStrings.SIGVTALRM
        - tmttyped.node.nodeStrings.SIGWINCH
        - tmttyped.node.nodeStrings.SIGXCPU
        - tmttyped.node.nodeStrings.SIGXFSZ
        - tmttyped.node.nodeStrings.SIGBREAK
        - tmttyped.node.nodeStrings.SIGLOST
        - tmttyped.node.nodeStrings.SIGINFO
      */
      trait Signals extends StObject
      object Signals {
        
        @scala.inline
        def SIGABRT: tmttyped.node.nodeStrings.SIGABRT = "SIGABRT".asInstanceOf[tmttyped.node.nodeStrings.SIGABRT]
        
        @scala.inline
        def SIGALRM: tmttyped.node.nodeStrings.SIGALRM = "SIGALRM".asInstanceOf[tmttyped.node.nodeStrings.SIGALRM]
        
        @scala.inline
        def SIGBREAK: tmttyped.node.nodeStrings.SIGBREAK = "SIGBREAK".asInstanceOf[tmttyped.node.nodeStrings.SIGBREAK]
        
        @scala.inline
        def SIGBUS: tmttyped.node.nodeStrings.SIGBUS = "SIGBUS".asInstanceOf[tmttyped.node.nodeStrings.SIGBUS]
        
        @scala.inline
        def SIGCHLD: tmttyped.node.nodeStrings.SIGCHLD = "SIGCHLD".asInstanceOf[tmttyped.node.nodeStrings.SIGCHLD]
        
        @scala.inline
        def SIGCONT: tmttyped.node.nodeStrings.SIGCONT = "SIGCONT".asInstanceOf[tmttyped.node.nodeStrings.SIGCONT]
        
        @scala.inline
        def SIGFPE: tmttyped.node.nodeStrings.SIGFPE = "SIGFPE".asInstanceOf[tmttyped.node.nodeStrings.SIGFPE]
        
        @scala.inline
        def SIGHUP: tmttyped.node.nodeStrings.SIGHUP = "SIGHUP".asInstanceOf[tmttyped.node.nodeStrings.SIGHUP]
        
        @scala.inline
        def SIGILL: tmttyped.node.nodeStrings.SIGILL = "SIGILL".asInstanceOf[tmttyped.node.nodeStrings.SIGILL]
        
        @scala.inline
        def SIGINFO: tmttyped.node.nodeStrings.SIGINFO = "SIGINFO".asInstanceOf[tmttyped.node.nodeStrings.SIGINFO]
        
        @scala.inline
        def SIGINT: tmttyped.node.nodeStrings.SIGINT = "SIGINT".asInstanceOf[tmttyped.node.nodeStrings.SIGINT]
        
        @scala.inline
        def SIGIO: tmttyped.node.nodeStrings.SIGIO = "SIGIO".asInstanceOf[tmttyped.node.nodeStrings.SIGIO]
        
        @scala.inline
        def SIGIOT: tmttyped.node.nodeStrings.SIGIOT = "SIGIOT".asInstanceOf[tmttyped.node.nodeStrings.SIGIOT]
        
        @scala.inline
        def SIGKILL: tmttyped.node.nodeStrings.SIGKILL = "SIGKILL".asInstanceOf[tmttyped.node.nodeStrings.SIGKILL]
        
        @scala.inline
        def SIGLOST: tmttyped.node.nodeStrings.SIGLOST = "SIGLOST".asInstanceOf[tmttyped.node.nodeStrings.SIGLOST]
        
        @scala.inline
        def SIGPIPE: tmttyped.node.nodeStrings.SIGPIPE = "SIGPIPE".asInstanceOf[tmttyped.node.nodeStrings.SIGPIPE]
        
        @scala.inline
        def SIGPOLL: tmttyped.node.nodeStrings.SIGPOLL = "SIGPOLL".asInstanceOf[tmttyped.node.nodeStrings.SIGPOLL]
        
        @scala.inline
        def SIGPROF: tmttyped.node.nodeStrings.SIGPROF = "SIGPROF".asInstanceOf[tmttyped.node.nodeStrings.SIGPROF]
        
        @scala.inline
        def SIGPWR: tmttyped.node.nodeStrings.SIGPWR = "SIGPWR".asInstanceOf[tmttyped.node.nodeStrings.SIGPWR]
        
        @scala.inline
        def SIGQUIT: tmttyped.node.nodeStrings.SIGQUIT = "SIGQUIT".asInstanceOf[tmttyped.node.nodeStrings.SIGQUIT]
        
        @scala.inline
        def SIGSEGV: tmttyped.node.nodeStrings.SIGSEGV = "SIGSEGV".asInstanceOf[tmttyped.node.nodeStrings.SIGSEGV]
        
        @scala.inline
        def SIGSTKFLT: tmttyped.node.nodeStrings.SIGSTKFLT = "SIGSTKFLT".asInstanceOf[tmttyped.node.nodeStrings.SIGSTKFLT]
        
        @scala.inline
        def SIGSTOP: tmttyped.node.nodeStrings.SIGSTOP = "SIGSTOP".asInstanceOf[tmttyped.node.nodeStrings.SIGSTOP]
        
        @scala.inline
        def SIGSYS: tmttyped.node.nodeStrings.SIGSYS = "SIGSYS".asInstanceOf[tmttyped.node.nodeStrings.SIGSYS]
        
        @scala.inline
        def SIGTERM: tmttyped.node.nodeStrings.SIGTERM = "SIGTERM".asInstanceOf[tmttyped.node.nodeStrings.SIGTERM]
        
        @scala.inline
        def SIGTRAP: tmttyped.node.nodeStrings.SIGTRAP = "SIGTRAP".asInstanceOf[tmttyped.node.nodeStrings.SIGTRAP]
        
        @scala.inline
        def SIGTSTP: tmttyped.node.nodeStrings.SIGTSTP = "SIGTSTP".asInstanceOf[tmttyped.node.nodeStrings.SIGTSTP]
        
        @scala.inline
        def SIGTTIN: tmttyped.node.nodeStrings.SIGTTIN = "SIGTTIN".asInstanceOf[tmttyped.node.nodeStrings.SIGTTIN]
        
        @scala.inline
        def SIGTTOU: tmttyped.node.nodeStrings.SIGTTOU = "SIGTTOU".asInstanceOf[tmttyped.node.nodeStrings.SIGTTOU]
        
        @scala.inline
        def SIGUNUSED: tmttyped.node.nodeStrings.SIGUNUSED = "SIGUNUSED".asInstanceOf[tmttyped.node.nodeStrings.SIGUNUSED]
        
        @scala.inline
        def SIGURG: tmttyped.node.nodeStrings.SIGURG = "SIGURG".asInstanceOf[tmttyped.node.nodeStrings.SIGURG]
        
        @scala.inline
        def SIGUSR1: tmttyped.node.nodeStrings.SIGUSR1 = "SIGUSR1".asInstanceOf[tmttyped.node.nodeStrings.SIGUSR1]
        
        @scala.inline
        def SIGUSR2: tmttyped.node.nodeStrings.SIGUSR2 = "SIGUSR2".asInstanceOf[tmttyped.node.nodeStrings.SIGUSR2]
        
        @scala.inline
        def SIGVTALRM: tmttyped.node.nodeStrings.SIGVTALRM = "SIGVTALRM".asInstanceOf[tmttyped.node.nodeStrings.SIGVTALRM]
        
        @scala.inline
        def SIGWINCH: tmttyped.node.nodeStrings.SIGWINCH = "SIGWINCH".asInstanceOf[tmttyped.node.nodeStrings.SIGWINCH]
        
        @scala.inline
        def SIGXCPU: tmttyped.node.nodeStrings.SIGXCPU = "SIGXCPU".asInstanceOf[tmttyped.node.nodeStrings.SIGXCPU]
        
        @scala.inline
        def SIGXFSZ: tmttyped.node.nodeStrings.SIGXFSZ = "SIGXFSZ".asInstanceOf[tmttyped.node.nodeStrings.SIGXFSZ]
      }
      
      type SignalsListener = js.Function1[/* signal */ Signals, Unit]
      
      @js.native
      trait Socket
        extends StObject
           with ReadWriteStream {
        
        var isTTY: js.UndefOr[`true`] = js.native
      }
      
      type UncaughtExceptionListener = js.Function1[/* error */ js.Error, Unit]
      
      type UnhandledRejectionListener = js.Function2[/* reason */ js.UndefOr[js.Object | Null], /* promise */ js.Promise[js.Any], Unit]
      
      type WarningListener = js.Function1[/* warning */ js.Error, Unit]
      
      type WorkerListener = js.Function1[/* worker */ Worker, Unit]
      
      type WriteStream = tmttyped.node.nodeTtyMod.WriteStream
    }
  }
  
  type _To = Process
  
  /* This means you don't have to write `^`, but can instead just say `processMod.foo` */
  override def _to: Process = ^
}
