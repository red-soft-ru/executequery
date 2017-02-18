package org.executequery.actions.usermanagercommands;
import org.executequery.GUIUtilities;
import org.executequery.actions.OpenFrameCommand;
import org.executequery.gui.browser.CreateDatabasePanel;
import org.executequery.gui.browser.UserManagerPanel;
import org.underworldlabs.swing.actions.BaseCommand;

import java.awt.event.ActionEvent;

/**
 * Created by МишаИОля on 09.02.2017.
 */
public class UserManagerCommands extends OpenFrameCommand implements BaseCommand {

    public void execute(ActionEvent e) {

        GUIUtilities.addCentralPane(UserManagerPanel.TITLE,
                UserManagerPanel.FRAME_ICON,
                new UserManagerPanel(),
                null,
                true);
    }
}



