package tmttyped.node.inspectorMod

import tmttyped.node.inspectorMod.Console.MessageAddedEventDataType
import tmttyped.node.inspectorMod.Debugger.BreakpointResolvedEventDataType
import tmttyped.node.inspectorMod.Debugger.ContinueToLocationParameterType
import tmttyped.node.inspectorMod.Debugger.EnableReturnType
import tmttyped.node.inspectorMod.Debugger.EvaluateOnCallFrameParameterType
import tmttyped.node.inspectorMod.Debugger.EvaluateOnCallFrameReturnType
import tmttyped.node.inspectorMod.Debugger.GetPossibleBreakpointsParameterType
import tmttyped.node.inspectorMod.Debugger.GetPossibleBreakpointsReturnType
import tmttyped.node.inspectorMod.Debugger.GetScriptSourceParameterType
import tmttyped.node.inspectorMod.Debugger.GetScriptSourceReturnType
import tmttyped.node.inspectorMod.Debugger.GetStackTraceParameterType
import tmttyped.node.inspectorMod.Debugger.GetStackTraceReturnType
import tmttyped.node.inspectorMod.Debugger.PauseOnAsyncCallParameterType
import tmttyped.node.inspectorMod.Debugger.PausedEventDataType
import tmttyped.node.inspectorMod.Debugger.RemoveBreakpointParameterType
import tmttyped.node.inspectorMod.Debugger.RestartFrameParameterType
import tmttyped.node.inspectorMod.Debugger.RestartFrameReturnType
import tmttyped.node.inspectorMod.Debugger.ScriptFailedToParseEventDataType
import tmttyped.node.inspectorMod.Debugger.ScriptParsedEventDataType
import tmttyped.node.inspectorMod.Debugger.SearchInContentParameterType
import tmttyped.node.inspectorMod.Debugger.SearchInContentReturnType
import tmttyped.node.inspectorMod.Debugger.SetAsyncCallStackDepthParameterType
import tmttyped.node.inspectorMod.Debugger.SetBlackboxPatternsParameterType
import tmttyped.node.inspectorMod.Debugger.SetBlackboxedRangesParameterType
import tmttyped.node.inspectorMod.Debugger.SetBreakpointByUrlParameterType
import tmttyped.node.inspectorMod.Debugger.SetBreakpointByUrlReturnType
import tmttyped.node.inspectorMod.Debugger.SetBreakpointParameterType
import tmttyped.node.inspectorMod.Debugger.SetBreakpointReturnType
import tmttyped.node.inspectorMod.Debugger.SetBreakpointsActiveParameterType
import tmttyped.node.inspectorMod.Debugger.SetPauseOnExceptionsParameterType
import tmttyped.node.inspectorMod.Debugger.SetReturnValueParameterType
import tmttyped.node.inspectorMod.Debugger.SetScriptSourceParameterType
import tmttyped.node.inspectorMod.Debugger.SetScriptSourceReturnType
import tmttyped.node.inspectorMod.Debugger.SetSkipAllPausesParameterType
import tmttyped.node.inspectorMod.Debugger.SetVariableValueParameterType
import tmttyped.node.inspectorMod.Debugger.StepIntoParameterType
import tmttyped.node.inspectorMod.HeapProfiler.AddHeapSnapshotChunkEventDataType
import tmttyped.node.inspectorMod.HeapProfiler.AddInspectedHeapObjectParameterType
import tmttyped.node.inspectorMod.HeapProfiler.GetHeapObjectIdParameterType
import tmttyped.node.inspectorMod.HeapProfiler.GetHeapObjectIdReturnType
import tmttyped.node.inspectorMod.HeapProfiler.GetObjectByHeapObjectIdParameterType
import tmttyped.node.inspectorMod.HeapProfiler.GetObjectByHeapObjectIdReturnType
import tmttyped.node.inspectorMod.HeapProfiler.GetSamplingProfileReturnType
import tmttyped.node.inspectorMod.HeapProfiler.HeapStatsUpdateEventDataType
import tmttyped.node.inspectorMod.HeapProfiler.LastSeenObjectIdEventDataType
import tmttyped.node.inspectorMod.HeapProfiler.ReportHeapSnapshotProgressEventDataType
import tmttyped.node.inspectorMod.HeapProfiler.StartSamplingParameterType
import tmttyped.node.inspectorMod.HeapProfiler.StartTrackingHeapObjectsParameterType
import tmttyped.node.inspectorMod.HeapProfiler.StopSamplingReturnType
import tmttyped.node.inspectorMod.HeapProfiler.StopTrackingHeapObjectsParameterType
import tmttyped.node.inspectorMod.HeapProfiler.TakeHeapSnapshotParameterType
import tmttyped.node.inspectorMod.NodeRuntime.NotifyWhenWaitingForDisconnectParameterType
import tmttyped.node.inspectorMod.NodeTracing.DataCollectedEventDataType
import tmttyped.node.inspectorMod.NodeTracing.GetCategoriesReturnType
import tmttyped.node.inspectorMod.NodeTracing.StartParameterType
import tmttyped.node.inspectorMod.NodeWorker.AttachedToWorkerEventDataType
import tmttyped.node.inspectorMod.NodeWorker.DetachParameterType
import tmttyped.node.inspectorMod.NodeWorker.DetachedFromWorkerEventDataType
import tmttyped.node.inspectorMod.NodeWorker.EnableParameterType
import tmttyped.node.inspectorMod.NodeWorker.ReceivedMessageFromWorkerEventDataType
import tmttyped.node.inspectorMod.NodeWorker.SendMessageToWorkerParameterType
import tmttyped.node.inspectorMod.Profiler.ConsoleProfileFinishedEventDataType
import tmttyped.node.inspectorMod.Profiler.ConsoleProfileStartedEventDataType
import tmttyped.node.inspectorMod.Profiler.GetBestEffortCoverageReturnType
import tmttyped.node.inspectorMod.Profiler.SetSamplingIntervalParameterType
import tmttyped.node.inspectorMod.Profiler.StartPreciseCoverageParameterType
import tmttyped.node.inspectorMod.Profiler.StopReturnType
import tmttyped.node.inspectorMod.Profiler.TakePreciseCoverageReturnType
import tmttyped.node.inspectorMod.Profiler.TakeTypeProfileReturnType
import tmttyped.node.inspectorMod.Runtime.AwaitPromiseParameterType
import tmttyped.node.inspectorMod.Runtime.AwaitPromiseReturnType
import tmttyped.node.inspectorMod.Runtime.CallFunctionOnParameterType
import tmttyped.node.inspectorMod.Runtime.CallFunctionOnReturnType
import tmttyped.node.inspectorMod.Runtime.CompileScriptParameterType
import tmttyped.node.inspectorMod.Runtime.CompileScriptReturnType
import tmttyped.node.inspectorMod.Runtime.ConsoleAPICalledEventDataType
import tmttyped.node.inspectorMod.Runtime.EvaluateParameterType
import tmttyped.node.inspectorMod.Runtime.EvaluateReturnType
import tmttyped.node.inspectorMod.Runtime.ExceptionRevokedEventDataType
import tmttyped.node.inspectorMod.Runtime.ExceptionThrownEventDataType
import tmttyped.node.inspectorMod.Runtime.ExecutionContextCreatedEventDataType
import tmttyped.node.inspectorMod.Runtime.ExecutionContextDestroyedEventDataType
import tmttyped.node.inspectorMod.Runtime.GetPropertiesParameterType
import tmttyped.node.inspectorMod.Runtime.GetPropertiesReturnType
import tmttyped.node.inspectorMod.Runtime.GlobalLexicalScopeNamesParameterType
import tmttyped.node.inspectorMod.Runtime.GlobalLexicalScopeNamesReturnType
import tmttyped.node.inspectorMod.Runtime.InspectRequestedEventDataType
import tmttyped.node.inspectorMod.Runtime.QueryObjectsParameterType
import tmttyped.node.inspectorMod.Runtime.QueryObjectsReturnType
import tmttyped.node.inspectorMod.Runtime.ReleaseObjectGroupParameterType
import tmttyped.node.inspectorMod.Runtime.ReleaseObjectParameterType
import tmttyped.node.inspectorMod.Runtime.RunScriptParameterType
import tmttyped.node.inspectorMod.Runtime.RunScriptReturnType
import tmttyped.node.inspectorMod.Runtime.SetCustomObjectFormatterEnabledParameterType
import tmttyped.node.inspectorMod.Schema.GetDomainsReturnType
import tmttyped.node.nodeStrings.ConsoleDotclearMessages
import tmttyped.node.nodeStrings.ConsoleDotdisable
import tmttyped.node.nodeStrings.ConsoleDotenable
import tmttyped.node.nodeStrings.ConsoleDotmessageAdded
import tmttyped.node.nodeStrings.DebuggerDotbreakpointResolved
import tmttyped.node.nodeStrings.DebuggerDotcontinueToLocation
import tmttyped.node.nodeStrings.DebuggerDotdisable
import tmttyped.node.nodeStrings.DebuggerDotenable
import tmttyped.node.nodeStrings.DebuggerDotevaluateOnCallFrame
import tmttyped.node.nodeStrings.DebuggerDotgetPossibleBreakpoints
import tmttyped.node.nodeStrings.DebuggerDotgetScriptSource
import tmttyped.node.nodeStrings.DebuggerDotgetStackTrace
import tmttyped.node.nodeStrings.DebuggerDotpause
import tmttyped.node.nodeStrings.DebuggerDotpauseOnAsyncCall
import tmttyped.node.nodeStrings.DebuggerDotpaused
import tmttyped.node.nodeStrings.DebuggerDotremoveBreakpoint
import tmttyped.node.nodeStrings.DebuggerDotrestartFrame
import tmttyped.node.nodeStrings.DebuggerDotresume
import tmttyped.node.nodeStrings.DebuggerDotresumed
import tmttyped.node.nodeStrings.DebuggerDotscheduleStepIntoAsync
import tmttyped.node.nodeStrings.DebuggerDotscriptFailedToParse
import tmttyped.node.nodeStrings.DebuggerDotscriptParsed
import tmttyped.node.nodeStrings.DebuggerDotsearchInContent
import tmttyped.node.nodeStrings.DebuggerDotsetAsyncCallStackDepth
import tmttyped.node.nodeStrings.DebuggerDotsetBlackboxPatterns
import tmttyped.node.nodeStrings.DebuggerDotsetBlackboxedRanges
import tmttyped.node.nodeStrings.DebuggerDotsetBreakpoint
import tmttyped.node.nodeStrings.DebuggerDotsetBreakpointByUrl
import tmttyped.node.nodeStrings.DebuggerDotsetBreakpointsActive
import tmttyped.node.nodeStrings.DebuggerDotsetPauseOnExceptions
import tmttyped.node.nodeStrings.DebuggerDotsetReturnValue
import tmttyped.node.nodeStrings.DebuggerDotsetScriptSource
import tmttyped.node.nodeStrings.DebuggerDotsetSkipAllPauses
import tmttyped.node.nodeStrings.DebuggerDotsetVariableValue
import tmttyped.node.nodeStrings.DebuggerDotstepInto
import tmttyped.node.nodeStrings.DebuggerDotstepOut
import tmttyped.node.nodeStrings.DebuggerDotstepOver
import tmttyped.node.nodeStrings.HeapProfilerDotaddHeapSnapshotChunk
import tmttyped.node.nodeStrings.HeapProfilerDotaddInspectedHeapObject
import tmttyped.node.nodeStrings.HeapProfilerDotcollectGarbage
import tmttyped.node.nodeStrings.HeapProfilerDotdisable
import tmttyped.node.nodeStrings.HeapProfilerDotenable
import tmttyped.node.nodeStrings.HeapProfilerDotgetHeapObjectId
import tmttyped.node.nodeStrings.HeapProfilerDotgetObjectByHeapObjectId
import tmttyped.node.nodeStrings.HeapProfilerDotgetSamplingProfile
import tmttyped.node.nodeStrings.HeapProfilerDotheapStatsUpdate
import tmttyped.node.nodeStrings.HeapProfilerDotlastSeenObjectId
import tmttyped.node.nodeStrings.HeapProfilerDotreportHeapSnapshotProgress
import tmttyped.node.nodeStrings.HeapProfilerDotresetProfiles
import tmttyped.node.nodeStrings.HeapProfilerDotstartSampling
import tmttyped.node.nodeStrings.HeapProfilerDotstartTrackingHeapObjects
import tmttyped.node.nodeStrings.HeapProfilerDotstopSampling
import tmttyped.node.nodeStrings.HeapProfilerDotstopTrackingHeapObjects
import tmttyped.node.nodeStrings.HeapProfilerDottakeHeapSnapshot
import tmttyped.node.nodeStrings.NodeRuntimeDotnotifyWhenWaitingForDisconnect
import tmttyped.node.nodeStrings.NodeRuntimeDotwaitingForDisconnect
import tmttyped.node.nodeStrings.NodeTracingDotdataCollected
import tmttyped.node.nodeStrings.NodeTracingDotgetCategories
import tmttyped.node.nodeStrings.NodeTracingDotstart
import tmttyped.node.nodeStrings.NodeTracingDotstop
import tmttyped.node.nodeStrings.NodeTracingDottracingComplete
import tmttyped.node.nodeStrings.NodeWorkerDotattachedToWorker
import tmttyped.node.nodeStrings.NodeWorkerDotdetach
import tmttyped.node.nodeStrings.NodeWorkerDotdetachedFromWorker
import tmttyped.node.nodeStrings.NodeWorkerDotdisable
import tmttyped.node.nodeStrings.NodeWorkerDotenable
import tmttyped.node.nodeStrings.NodeWorkerDotreceivedMessageFromWorker
import tmttyped.node.nodeStrings.NodeWorkerDotsendMessageToWorker
import tmttyped.node.nodeStrings.ProfilerDotconsoleProfileFinished
import tmttyped.node.nodeStrings.ProfilerDotconsoleProfileStarted
import tmttyped.node.nodeStrings.ProfilerDotdisable
import tmttyped.node.nodeStrings.ProfilerDotenable
import tmttyped.node.nodeStrings.ProfilerDotgetBestEffortCoverage
import tmttyped.node.nodeStrings.ProfilerDotsetSamplingInterval
import tmttyped.node.nodeStrings.ProfilerDotstart
import tmttyped.node.nodeStrings.ProfilerDotstartPreciseCoverage
import tmttyped.node.nodeStrings.ProfilerDotstartTypeProfile
import tmttyped.node.nodeStrings.ProfilerDotstop
import tmttyped.node.nodeStrings.ProfilerDotstopPreciseCoverage
import tmttyped.node.nodeStrings.ProfilerDotstopTypeProfile
import tmttyped.node.nodeStrings.ProfilerDottakePreciseCoverage
import tmttyped.node.nodeStrings.ProfilerDottakeTypeProfile
import tmttyped.node.nodeStrings.RuntimeDotawaitPromise
import tmttyped.node.nodeStrings.RuntimeDotcallFunctionOn
import tmttyped.node.nodeStrings.RuntimeDotcompileScript
import tmttyped.node.nodeStrings.RuntimeDotconsoleAPICalled
import tmttyped.node.nodeStrings.RuntimeDotdisable
import tmttyped.node.nodeStrings.RuntimeDotdiscardConsoleEntries
import tmttyped.node.nodeStrings.RuntimeDotenable
import tmttyped.node.nodeStrings.RuntimeDotevaluate
import tmttyped.node.nodeStrings.RuntimeDotexceptionRevoked
import tmttyped.node.nodeStrings.RuntimeDotexceptionThrown
import tmttyped.node.nodeStrings.RuntimeDotexecutionContextCreated
import tmttyped.node.nodeStrings.RuntimeDotexecutionContextDestroyed
import tmttyped.node.nodeStrings.RuntimeDotexecutionContextsCleared
import tmttyped.node.nodeStrings.RuntimeDotgetProperties
import tmttyped.node.nodeStrings.RuntimeDotglobalLexicalScopeNames
import tmttyped.node.nodeStrings.RuntimeDotinspectRequested
import tmttyped.node.nodeStrings.RuntimeDotqueryObjects
import tmttyped.node.nodeStrings.RuntimeDotreleaseObject
import tmttyped.node.nodeStrings.RuntimeDotreleaseObjectGroup
import tmttyped.node.nodeStrings.RuntimeDotrunIfWaitingForDebugger
import tmttyped.node.nodeStrings.RuntimeDotrunScript
import tmttyped.node.nodeStrings.RuntimeDotsetCustomObjectFormatterEnabled
import tmttyped.node.nodeStrings.SchemaDotgetDomains
import tmttyped.node.nodeStrings.inspectorNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `inspector.Session` is used for dispatching messages to the V8 inspector
  * back-end and receiving message responses and notifications.
  */
@JSImport("inspector", "Session")
@js.native
/**
  * Create a new instance of the inspector.Session class.
  * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
  */
open class Session () extends StObject {
  
  // Events
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("addListener")
  def addListener_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("addListener")
  def addListener_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("addListener")
  def addListener_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("addListener")
  def addListener_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("addListener")
  def addListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("addListener")
  def addListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("addListener")
  def addListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("addListener")
  def addListener_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("addListener")
  def addListener_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("addListener")
  def addListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("addListener")
  def addListener_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("addListener")
  def addListener_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("addListener")
  def addListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  
  /**
    * Connects a session to the inspector back-end.
    * @since v8.0.0
    */
  def connect(): Unit = js.native
  
  /**
    * Immediately close the session. All pending message callbacks will be called
    * with an error. `session.connect()` will need to be called to be able to send
    * messages again. Reconnected session will lose all inspector state, such as
    * enabled agents or configured breakpoints.
    * @since v8.0.0
    */
  def disconnect(): Unit = js.native
  
  def emit(event: String, args: Any*): Boolean = js.native
  def emit(event: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_ConsolemessageAdded(event: ConsoleDotmessageAdded, message: InspectorNotification[MessageAddedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    message: InspectorNotification[BreakpointResolvedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_Debuggerpaused(event: DebuggerDotpaused, message: InspectorNotification[PausedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_Debuggerresumed(event: DebuggerDotresumed): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    message: InspectorNotification[ScriptFailedToParseEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptParsed(event: DebuggerDotscriptParsed, message: InspectorNotification[ScriptParsedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    message: InspectorNotification[AddHeapSnapshotChunkEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    message: InspectorNotification[HeapStatsUpdateEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    message: InspectorNotification[LastSeenObjectIdEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    message: InspectorNotification[ReportHeapSnapshotProgressEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles): Boolean = js.native
  @JSName("emit")
  def emit_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect): Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingdataCollected(event: NodeTracingDotdataCollected, message: InspectorNotification[DataCollectedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingtracingComplete(event: NodeTracingDottracingComplete): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    message: InspectorNotification[AttachedToWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    message: InspectorNotification[DetachedFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    message: InspectorNotification[ReceivedMessageFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    message: InspectorNotification[ConsoleProfileFinishedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    message: InspectorNotification[ConsoleProfileStartedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeconsoleAPICalled(event: RuntimeDotconsoleAPICalled, message: InspectorNotification[ConsoleAPICalledEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionRevoked(event: RuntimeDotexceptionRevoked, message: InspectorNotification[ExceptionRevokedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionThrown(event: RuntimeDotexceptionThrown, message: InspectorNotification[ExceptionThrownEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    message: InspectorNotification[ExecutionContextCreatedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    message: InspectorNotification[ExecutionContextDestroyedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeinspectRequested(event: RuntimeDotinspectRequested, message: InspectorNotification[InspectRequestedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_inspectorNotification(event: inspectorNotification, message: InspectorNotification[js.Object]): Boolean = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  def on_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  def on_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  def on_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  def on_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("on")
  def on_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("on")
  def on_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("on")
  def on_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("on")
  def on_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("on")
  def on_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("on")
  def on_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("on")
  def on_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("on")
  def on_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("on")
  def on_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  def on_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("on")
  def on_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("on")
  def on_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("on")
  def on_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("on")
  def on_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("on")
  def on_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("on")
  def on_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("on")
  def on_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("on")
  def on_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("once")
  def once_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("once")
  def once_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("once")
  def once_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("once")
  def once_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("once")
  def once_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("once")
  def once_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("once")
  def once_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("once")
  def once_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("once")
  def once_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("once")
  def once_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("once")
  def once_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("once")
  def once_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("once")
  def once_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("once")
  def once_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("once")
  def once_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("once")
  def once_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("once")
  def once_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("once")
  def once_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("once")
  def once_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("once")
  def once_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("once")
  def once_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("once")
  def once_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("once")
  def once_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  
  /**
    * Posts a message to the inspector back-end. `callback` will be notified when
    * a response is received. `callback` is a function that accepts two optional
    * arguments: error and message-specific result.
    *
    * ```js
    * session.post('Runtime.evaluate', { expression: '2 + 2' },
    *              (error, { result }) => console.log(result));
    * // Output: { type: 'number', value: 4, description: '4' }
    * ```
    *
    * The latest version of the V8 inspector protocol is published on the [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/v8/).
    *
    * Node.js inspector supports all the Chrome DevTools Protocol domains declared
    * by V8\. Chrome DevTools Protocol domain provides an interface for interacting
    * with one of the runtime agents used to inspect the application state and listen
    * to the run-time events.
    *
    * ## Example usage
    *
    * Apart from the debugger, various V8 Profilers are available through the DevTools
    * protocol.
    * @since v8.0.0
    */
  def post(method: String): Unit = js.native
  def post(
    method: String,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def post(method: String, params: js.Object): Unit = js.native
  def post(
    method: String,
    params: js.Object,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def post(
    method: String,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  /**
    * Does nothing.
    */
  @JSName("post")
  def post_ConsoleclearMessages(method: ConsoleDotclearMessages): Unit = js.native
  @JSName("post")
  def post_ConsoleclearMessages(method: ConsoleDotclearMessages, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  @JSName("post")
  def post_Consoledisable(method: ConsoleDotdisable): Unit = js.native
  @JSName("post")
  def post_Consoledisable(method: ConsoleDotdisable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
    */
  @JSName("post")
  def post_Consoleenable(method: ConsoleDotenable): Unit = js.native
  @JSName("post")
  def post_Consoleenable(method: ConsoleDotenable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Continues execution until specific location is reached.
    */
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDotcontinueToLocation): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDotcontinueToLocation, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: DebuggerDotcontinueToLocation,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDotcontinueToLocation, params: ContinueToLocationParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: DebuggerDotcontinueToLocation,
    params: ContinueToLocationParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Disables debugger for given page.
    */
  @JSName("post")
  def post_Debuggerdisable(method: DebuggerDotdisable): Unit = js.native
  @JSName("post")
  def post_Debuggerdisable(method: DebuggerDotdisable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
    */
  @JSName("post")
  def post_Debuggerenable(method: DebuggerDotenable): Unit = js.native
  @JSName("post")
  def post_Debuggerenable(
    method: DebuggerDotenable,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EnableReturnType, Unit]
  ): Unit = js.native
  /**
    * Evaluates expression on a given call frame.
    */
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: DebuggerDotevaluateOnCallFrame): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDotevaluateOnCallFrame,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDotevaluateOnCallFrame,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: DebuggerDotevaluateOnCallFrame, params: EvaluateOnCallFrameParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDotevaluateOnCallFrame,
    params: EvaluateOnCallFrameParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
    */
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: DebuggerDotgetPossibleBreakpoints): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDotgetPossibleBreakpoints,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDotgetPossibleBreakpoints,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: DebuggerDotgetPossibleBreakpoints, params: GetPossibleBreakpointsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDotgetPossibleBreakpoints,
    params: GetPossibleBreakpointsParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns source for the script with given id.
    */
  @JSName("post")
  def post_DebuggergetScriptSource(method: DebuggerDotgetScriptSource): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDotgetScriptSource,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDotgetScriptSource,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(method: DebuggerDotgetScriptSource, params: GetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDotgetScriptSource,
    params: GetScriptSourceParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns stack trace with given <code>stackTraceId</code>.
    * @experimental
    */
  @JSName("post")
  def post_DebuggergetStackTrace(method: DebuggerDotgetStackTrace): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDotgetStackTrace,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDotgetStackTrace,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(method: DebuggerDotgetStackTrace, params: GetStackTraceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDotgetStackTrace,
    params: GetStackTraceParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  /**
    * Stops on the next JavaScript statement.
    */
  @JSName("post")
  def post_Debuggerpause(method: DebuggerDotpause): Unit = js.native
  @JSName("post")
  def post_Debuggerpause(method: DebuggerDotpause, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDotpauseOnAsyncCall): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDotpauseOnAsyncCall, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: DebuggerDotpauseOnAsyncCall,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDotpauseOnAsyncCall, params: PauseOnAsyncCallParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: DebuggerDotpauseOnAsyncCall,
    params: PauseOnAsyncCallParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Removes JavaScript breakpoint.
    */
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDotremoveBreakpoint): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDotremoveBreakpoint, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: DebuggerDotremoveBreakpoint,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDotremoveBreakpoint, params: RemoveBreakpointParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: DebuggerDotremoveBreakpoint,
    params: RemoveBreakpointParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Restarts particular call frame from the beginning.
    */
  @JSName("post")
  def post_DebuggerrestartFrame(method: DebuggerDotrestartFrame): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDotrestartFrame,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDotrestartFrame,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(method: DebuggerDotrestartFrame, params: RestartFrameParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDotrestartFrame,
    params: RestartFrameParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  /**
    * Resumes JavaScript execution.
    */
  @JSName("post")
  def post_Debuggerresume(method: DebuggerDotresume): Unit = js.native
  @JSName("post")
  def post_Debuggerresume(method: DebuggerDotresume, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled before next pause. Returns success when async task is actually scheduled, returns error if no task were scheduled or another scheduleStepIntoAsync was called.
    * @experimental
    */
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: DebuggerDotscheduleStepIntoAsync): Unit = js.native
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: DebuggerDotscheduleStepIntoAsync, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Searches for given string in script content.
    */
  @JSName("post")
  def post_DebuggersearchInContent(method: DebuggerDotsearchInContent): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDotsearchInContent,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDotsearchInContent,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(method: DebuggerDotsearchInContent, params: SearchInContentParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDotsearchInContent,
    params: SearchInContentParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDotsetAsyncCallStackDepth): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDotsetAsyncCallStackDepth, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: DebuggerDotsetAsyncCallStackDepth,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDotsetAsyncCallStackDepth, params: SetAsyncCallStackDepthParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: DebuggerDotsetAsyncCallStackDepth,
    params: SetAsyncCallStackDepthParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDotsetBlackboxPatterns): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDotsetBlackboxPatterns, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: DebuggerDotsetBlackboxPatterns,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDotsetBlackboxPatterns, params: SetBlackboxPatternsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: DebuggerDotsetBlackboxPatterns,
    params: SetBlackboxPatternsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDotsetBlackboxedRanges): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDotsetBlackboxedRanges, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: DebuggerDotsetBlackboxedRanges,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDotsetBlackboxedRanges, params: SetBlackboxedRangesParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: DebuggerDotsetBlackboxedRanges,
    params: SetBlackboxedRangesParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  @JSName("post")
  def post_DebuggersetBreakpoint(method: DebuggerDotsetBreakpoint): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDotsetBreakpoint,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDotsetBreakpoint,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(method: DebuggerDotsetBreakpoint, params: SetBreakpointParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDotsetBreakpoint,
    params: SetBreakpointParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
    */
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: DebuggerDotsetBreakpointByUrl): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDotsetBreakpointByUrl,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDotsetBreakpointByUrl,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: DebuggerDotsetBreakpointByUrl, params: SetBreakpointByUrlParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDotsetBreakpointByUrl,
    params: SetBreakpointByUrlParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDotsetBreakpointsActive): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDotsetBreakpointsActive, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: DebuggerDotsetBreakpointsActive,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDotsetBreakpointsActive, params: SetBreakpointsActiveParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: DebuggerDotsetBreakpointsActive,
    params: SetBreakpointsActiveParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
    */
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDotsetPauseOnExceptions): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDotsetPauseOnExceptions, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: DebuggerDotsetPauseOnExceptions,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDotsetPauseOnExceptions, params: SetPauseOnExceptionsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: DebuggerDotsetPauseOnExceptions,
    params: SetPauseOnExceptionsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Changes return value in top frame. Available only at return break position.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDotsetReturnValue): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDotsetReturnValue, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: DebuggerDotsetReturnValue,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDotsetReturnValue, params: SetReturnValueParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: DebuggerDotsetReturnValue,
    params: SetReturnValueParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Edits JavaScript source live.
    */
  @JSName("post")
  def post_DebuggersetScriptSource(method: DebuggerDotsetScriptSource): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDotsetScriptSource,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDotsetScriptSource,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(method: DebuggerDotsetScriptSource, params: SetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDotsetScriptSource,
    params: SetScriptSourceParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDotsetSkipAllPauses): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDotsetSkipAllPauses, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: DebuggerDotsetSkipAllPauses,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDotsetSkipAllPauses, params: SetSkipAllPausesParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: DebuggerDotsetSkipAllPauses,
    params: SetSkipAllPausesParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
    */
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDotsetVariableValue): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDotsetVariableValue, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: DebuggerDotsetVariableValue,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDotsetVariableValue, params: SetVariableValueParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: DebuggerDotsetVariableValue,
    params: SetVariableValueParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Steps into the function call.
    */
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto, params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDotstepInto, params: StepIntoParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(
    method: DebuggerDotstepInto,
    params: StepIntoParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Steps out of the function call.
    */
  @JSName("post")
  def post_DebuggerstepOut(method: DebuggerDotstepOut): Unit = js.native
  @JSName("post")
  def post_DebuggerstepOut(method: DebuggerDotstepOut, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Steps over the statement.
    */
  @JSName("post")
  def post_DebuggerstepOver(method: DebuggerDotstepOver): Unit = js.native
  @JSName("post")
  def post_DebuggerstepOver(method: DebuggerDotstepOver, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
    */
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: HeapProfilerDotaddInspectedHeapObject): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDotaddInspectedHeapObject,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDotaddInspectedHeapObject,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: HeapProfilerDotaddInspectedHeapObject, params: AddInspectedHeapObjectParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDotaddInspectedHeapObject,
    params: AddInspectedHeapObjectParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: HeapProfilerDotcollectGarbage): Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: HeapProfilerDotcollectGarbage, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: HeapProfilerDotdisable): Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: HeapProfilerDotdisable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: HeapProfilerDotenable): Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: HeapProfilerDotenable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: HeapProfilerDotgetHeapObjectId): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDotgetHeapObjectId,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDotgetHeapObjectId,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: HeapProfilerDotgetHeapObjectId, params: GetHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDotgetHeapObjectId,
    params: GetHeapObjectIdParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: HeapProfilerDotgetObjectByHeapObjectId): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDotgetObjectByHeapObjectId,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDotgetObjectByHeapObjectId,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: HeapProfilerDotgetObjectByHeapObjectId, params: GetObjectByHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDotgetObjectByHeapObjectId,
    params: GetObjectByHeapObjectIdParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(method: HeapProfilerDotgetSamplingProfile): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(
    method: HeapProfilerDotgetSamplingProfile,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetSamplingProfileReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDotstartSampling): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDotstartSampling, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: HeapProfilerDotstartSampling,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDotstartSampling, params: StartSamplingParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: HeapProfilerDotstartSampling,
    params: StartSamplingParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: HeapProfilerDotstartTrackingHeapObjects): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDotstartTrackingHeapObjects,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDotstartTrackingHeapObjects,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: HeapProfilerDotstartTrackingHeapObjects, params: StartTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDotstartTrackingHeapObjects,
    params: StartTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(method: HeapProfilerDotstopSampling): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(
    method: HeapProfilerDotstopSampling,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ StopSamplingReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: HeapProfilerDotstopTrackingHeapObjects): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDotstopTrackingHeapObjects,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDotstopTrackingHeapObjects,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: HeapProfilerDotstopTrackingHeapObjects, params: StopTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDotstopTrackingHeapObjects,
    params: StopTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDottakeHeapSnapshot): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDottakeHeapSnapshot, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: HeapProfilerDottakeHeapSnapshot,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDottakeHeapSnapshot, params: TakeHeapSnapshotParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: HeapProfilerDottakeHeapSnapshot,
    params: TakeHeapSnapshotParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Enable the `NodeRuntime.waitingForDisconnect`.
    */
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(method: NodeRuntimeDotnotifyWhenWaitingForDisconnect): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    params: NotifyWhenWaitingForDisconnectParameterType
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDotnotifyWhenWaitingForDisconnect,
    params: NotifyWhenWaitingForDisconnectParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Gets supported tracing categories.
    */
  @JSName("post")
  def post_NodeTracinggetCategories(method: NodeTracingDotgetCategories): Unit = js.native
  @JSName("post")
  def post_NodeTracinggetCategories(
    method: NodeTracingDotgetCategories,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetCategoriesReturnType, Unit]
  ): Unit = js.native
  /**
    * Start trace events collection.
    */
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart, params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDotstart, params: StartParameterType): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(
    method: NodeTracingDotstart,
    params: StartParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Stop trace events collection. Remaining collected events will be sent as a sequence of
    * dataCollected events followed by tracingComplete event.
    */
  @JSName("post")
  def post_NodeTracingstop(method: NodeTracingDotstop): Unit = js.native
  @JSName("post")
  def post_NodeTracingstop(method: NodeTracingDotstop, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Detached from the worker with given sessionId.
    */
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach, params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDotdetach, params: DetachParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(
    method: NodeWorkerDotdetach,
    params: DetachParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Detaches from all running workers and disables attaching to new workers as they are started.
    */
  @JSName("post")
  def post_NodeWorkerdisable(method: NodeWorkerDotdisable): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdisable(method: NodeWorkerDotdisable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Instructs the inspector to attach to running workers. Will also attach to new workers
    * as they start
    */
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable, params: Unit, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDotenable, params: EnableParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(
    method: NodeWorkerDotenable,
    params: EnableParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Sends protocol message over session with given id.
    */
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDotsendMessageToWorker): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDotsendMessageToWorker, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: NodeWorkerDotsendMessageToWorker,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDotsendMessageToWorker, params: SendMessageToWorkerParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: NodeWorkerDotsendMessageToWorker,
    params: SendMessageToWorkerParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: ProfilerDotdisable): Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: ProfilerDotdisable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: ProfilerDotenable): Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: ProfilerDotenable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to garbage collection.
    */
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(method: ProfilerDotgetBestEffortCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(
    method: ProfilerDotgetBestEffortCoverage,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetBestEffortCoverageReturnType, Unit]
  ): Unit = js.native
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDotsetSamplingInterval): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDotsetSamplingInterval, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: ProfilerDotsetSamplingInterval,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDotsetSamplingInterval, params: SetSamplingIntervalParameterType): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: ProfilerDotsetSamplingInterval,
    params: SetSamplingIntervalParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: ProfilerDotstart): Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: ProfilerDotstart, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code coverage may be incomplete. Enabling prevents running optimized code and resets execution counters.
    */
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDotstartPreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDotstartPreciseCoverage, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: ProfilerDotstartPreciseCoverage,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDotstartPreciseCoverage, params: StartPreciseCoverageParameterType): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: ProfilerDotstartPreciseCoverage,
    params: StartPreciseCoverageParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Enable type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: ProfilerDotstartTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: ProfilerDotstartTypeProfile, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_Profilerstop(method: ProfilerDotstop): Unit = js.native
  @JSName("post")
  def post_Profilerstop(
    method: ProfilerDotstop,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ StopReturnType, Unit]
  ): Unit = js.native
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows executing optimized code.
    */
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: ProfilerDotstopPreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: ProfilerDotstopPreciseCoverage, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: ProfilerDotstopTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: ProfilerDotstopTypeProfile, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code coverage needs to have started.
    */
  @JSName("post")
  def post_ProfilertakePreciseCoverage(method: ProfilerDottakePreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilertakePreciseCoverage(
    method: ProfilerDottakePreciseCoverage,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ TakePreciseCoverageReturnType, Unit]
  ): Unit = js.native
  /**
    * Collect type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilertakeTypeProfile(method: ProfilerDottakeTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilertakeTypeProfile(
    method: ProfilerDottakeTypeProfile,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ TakeTypeProfileReturnType, Unit]
  ): Unit = js.native
  /**
    * Add handler to promise with given promise object id.
    */
  @JSName("post")
  def post_RuntimeawaitPromise(method: RuntimeDotawaitPromise): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDotawaitPromise,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDotawaitPromise,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(method: RuntimeDotawaitPromise, params: AwaitPromiseParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDotawaitPromise,
    params: AwaitPromiseParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  /**
    * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  def post_RuntimecallFunctionOn(method: RuntimeDotcallFunctionOn): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDotcallFunctionOn,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDotcallFunctionOn,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(method: RuntimeDotcallFunctionOn, params: CallFunctionOnParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDotcallFunctionOn,
    params: CallFunctionOnParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  /**
    * Compiles expression.
    */
  @JSName("post")
  def post_RuntimecompileScript(method: RuntimeDotcompileScript): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDotcompileScript,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDotcompileScript,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(method: RuntimeDotcompileScript, params: CompileScriptParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDotcompileScript,
    params: CompileScriptParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  /**
    * Disables reporting of execution contexts creation.
    */
  @JSName("post")
  def post_Runtimedisable(method: RuntimeDotdisable): Unit = js.native
  @JSName("post")
  def post_Runtimedisable(method: RuntimeDotdisable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Discards collected exceptions and console API calls.
    */
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: RuntimeDotdiscardConsoleEntries): Unit = js.native
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: RuntimeDotdiscardConsoleEntries, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Enables reporting of execution contexts creation by means of <code>executionContextCreated</code> event. When the reporting gets enabled the event will be sent immediately for each existing execution context.
    */
  @JSName("post")
  def post_Runtimeenable(method: RuntimeDotenable): Unit = js.native
  @JSName("post")
  def post_Runtimeenable(method: RuntimeDotenable, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Evaluates expression on global object.
    */
  @JSName("post")
  def post_Runtimeevaluate(method: RuntimeDotevaluate): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDotevaluate,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDotevaluate,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(method: RuntimeDotevaluate, params: EvaluateParameterType): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDotevaluate,
    params: EvaluateParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  def post_RuntimegetProperties(method: RuntimeDotgetProperties): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDotgetProperties,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDotgetProperties,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(method: RuntimeDotgetProperties, params: GetPropertiesParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDotgetProperties,
    params: GetPropertiesParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns all let, const and class variables from global scope.
    */
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: RuntimeDotglobalLexicalScopeNames): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDotglobalLexicalScopeNames,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDotglobalLexicalScopeNames,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: RuntimeDotglobalLexicalScopeNames, params: GlobalLexicalScopeNamesParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDotglobalLexicalScopeNames,
    params: GlobalLexicalScopeNamesParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: RuntimeDotqueryObjects): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDotqueryObjects,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDotqueryObjects,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: RuntimeDotqueryObjects, params: QueryObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDotqueryObjects,
    params: QueryObjectsParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  /**
    * Releases remote object with given id.
    */
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDotreleaseObject): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDotreleaseObject, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: RuntimeDotreleaseObject,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDotreleaseObject, params: ReleaseObjectParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: RuntimeDotreleaseObject,
    params: ReleaseObjectParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Releases all remote objects that belong to a given group.
    */
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDotreleaseObjectGroup): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDotreleaseObjectGroup, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: RuntimeDotreleaseObjectGroup,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDotreleaseObjectGroup, params: ReleaseObjectGroupParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: RuntimeDotreleaseObjectGroup,
    params: ReleaseObjectGroupParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: RuntimeDotrunIfWaitingForDebugger): Unit = js.native
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: RuntimeDotrunIfWaitingForDebugger, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  /**
    * Runs script with given id in a given context.
    */
  @JSName("post")
  def post_RuntimerunScript(method: RuntimeDotrunScript): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDotrunScript,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDotrunScript,
    params: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(method: RuntimeDotrunScript, params: RunScriptParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDotrunScript,
    params: RunScriptParameterType,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(method: RuntimeDotsetCustomObjectFormatterEnabled): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    params: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    params: SetCustomObjectFormatterEnabledParameterType
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDotsetCustomObjectFormatterEnabled,
    params: SetCustomObjectFormatterEnabledParameterType,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  /**
    * Returns supported domains.
    */
  @JSName("post")
  def post_SchemagetDomains(method: SchemaDotgetDomains): Unit = js.native
  @JSName("post")
  def post_SchemagetDomains(
    method: SchemaDotgetDomains,
    callback: js.Function2[/* err */ js.Error | Null, /* params */ GetDomainsReturnType, Unit]
  ): Unit = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependListener")
  def prependListener_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependListener")
  def prependListener_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependListener")
  def prependListener_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependListener")
  def prependListener_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependListener")
  def prependListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependListener")
  def prependListener_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependListener")
  def prependListener_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependListener")
  def prependListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ConsolemessageAdded(
    event: ConsoleDotmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerbreakpointResolved(
    event: DebuggerDotbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerpaused(
    event: DebuggerDotpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerresumed(event: DebuggerDotresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptFailedToParse(
    event: DebuggerDotscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptParsed(
    event: DebuggerDotscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDotaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDotheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDotlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDotreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerresetProfiles(event: HeapProfilerDotresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDotwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingdataCollected(
    event: NodeTracingDotdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingtracingComplete(event: NodeTracingDottracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDotattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDotdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDotreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileFinished(
    event: ProfilerDotconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileStarted(
    event: ProfilerDotconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeconsoleAPICalled(
    event: RuntimeDotconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionRevoked(
    event: RuntimeDotexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionThrown(
    event: RuntimeDotexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextCreated(
    event: RuntimeDotexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDotexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextsCleared(event: RuntimeDotexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeinspectRequested(
    event: RuntimeDotinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
}
