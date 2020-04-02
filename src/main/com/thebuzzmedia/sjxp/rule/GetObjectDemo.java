try (Connection myConn = DBUtil.connect();
             CallableStatement myFirstCs = myConn.prepareCall("{call getSECTION_NAME(?,?)}"))
        {
             myFirstCs.setString(1, searchSection);
             myFirstCs.registerOutParameter(2, Types.INTEGER);
             myFirstCs.executeUpdate();

             String name = null;

             System.out.println(myFirstCs.getObject(2));

            ResultSet myRs = null;
            myRs = (java.sql.ResultSet)myFirstCs.getObject(2);
            while (myRs.next()) // Retrieve result set rows
            {                  
                name=myRs.getString(1);
                System.out.print("Section Name: "+name);
            }
            myRs.close(); 
