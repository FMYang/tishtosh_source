package org.eclipse.mat.util;

import org.eclipse.mat.util.IProgressListener.Severity;

public class VoidProgressListener implements IProgressListener {
    private boolean cancelled;

    public void beginTask(String str, int i) {
    }

    public void done() {
    }

    public boolean isCanceled() {
        return this.cancelled;
    }

    public void sendUserMessage(Severity severity, String str, Throwable th) {
    }

    public void subTask(String str) {
    }

    public void worked(int i) {
    }

    public void setCanceled(boolean z) {
        this.cancelled = z;
    }
}
