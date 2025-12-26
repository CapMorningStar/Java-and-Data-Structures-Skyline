
   private String [] monNames  = {"", "January", "February", "March", "April", "May", "June",
                                  "July", "August", "September", "October", "November", "December"};
   private int [] monLengths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   

      try
      {
         slashPosn = date.indexOf ('/');
         if (slashPosn == -1)
            throw new MonthException();
         monStr = date.substring (
         dayStr = date.substring (
         monNum = Integer.parseInt (monStr);
         dayNum = Integer.parseInt (dayStr);
         if (monNum < 1 || monNum > 12)
            throw new MonthException ();
         if (dayNum > monLengths [monNum])
            throw new DayException ();
        System.out.println (date + " represents " + monNames [monNum] + " " + dayNum);
      }

      catch (NumberFormatException e)
      {
         System.out.println ("Number value expected.");
      }
      catch (MonthException e)
      {
         System.out.println (e.getMessage());
      }
      catch (DayException e)
      {
         System.out.println (e.getMessage());
      }
