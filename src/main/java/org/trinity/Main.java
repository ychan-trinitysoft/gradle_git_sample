/*
 * gradle_git_sample - digital logic design tool and simulator Copyright by the gradle_git_sample developers
 *
 * https://github.com/ychan-trinitysoft/
 *
 * This is free software released under GNU GPLv3 license
 */

package org.trinity;

import org.jdesktop.swingx.action.AbstractActionExt;
import org.fife.io.DocumentReader;
import com.formdev.flatlaf.FlatClientProperties;
import org.apache.commons.cli.AlreadySelectedException;
import javax.help.AbstractHelpAction;
import net.sf.nimrod.NimRODApplet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AbstractActionExt abstractActionExt;
        DocumentReader documentReader;
        FlatClientProperties flatClientProperties;
        AlreadySelectedException alreadySelectedException;
        AbstractHelpAction abstractHelpAction;
        NimRODApplet nimRODApplet;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}