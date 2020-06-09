/*
 * Copyright (c) 2020 Helmut Neemann.
 * Use of this source code is governed by the GPL v3 license
 * that can be found in the LICENSE file.
 */

import de.neemann.digital.cli.cli.CLIException;
import de.neemann.digital.cli.cli.Muxer;

/**
 * Entry point for the CLI interface
 */
public final class CLI {

    private CLI() {
    }

    /**
     * Entry point for the CLI interface
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Muxer.MAIN_MUXER.execute(args);
        } catch (CLIException e) {
            e.printMessage(System.out);
            System.out.println();
            Muxer.MAIN_MUXER.printDescription(System.out, "");
            System.exit(e.getExitCode());
        }
    }
}
